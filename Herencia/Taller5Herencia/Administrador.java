public class Administrador extends Usuario {
    private String nivelPermisos;

    public Administrador(String nombre, String correo, String nivelPermisos) {
        super(nombre, correo);
        this.nivelPermisos = nivelPermisos;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Tienes permisos de nivel " + nivelPermisos);
    }
}
