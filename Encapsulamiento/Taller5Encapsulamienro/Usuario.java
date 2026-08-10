

public class Usuario {
    private String nombreUsuario;
    private String password;
    private boolean cuentaBloqueada;
    private int contador = 0;

    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.cuentaBloqueada = false;
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contraseña actualizada correctamente.");
        } else {
            System.out.println(
                "Contraseña inválida: mínimo 8 caracteres y al menos un número."
            );
        }
    }

    public boolean verificarPassword(String intento) {

        // Si ya está bloqueada, no puede intentar
        if (cuentaBloqueada) {
            System.out.println("La cuenta está bloqueada.");
            return false;
        }

        // Verificar si la contraseña es correcta
        if (this.password != null && this.password.equals(intento)) {
            contador = 0;
            System.out.println("Contraseña correcta.");
            return true;
        }

        // Contraseña incorrecta
        contador++;

        System.out.println("Contraseña incorrecta.");
        System.out.println("Intentos fallidos: " + contador);

        // Bloquear después de 3 intentos incorrectos
        if (contador >= 3) {
            cuentaBloqueada = true;
            System.out.println("La cuenta ha sido bloqueada.");
        }

        return false;
    }

    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) {
            return false;
        }

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
}

