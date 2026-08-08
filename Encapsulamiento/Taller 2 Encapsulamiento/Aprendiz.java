public class Aprendiz {
    private String documento;
    private String nombre;
    private String correo;
    private int edad;
    private double notaFinal;

    public Aprendiz(String documento, String nombre, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = 0;
        this.notaFinal = 0.0;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 100.");
        }
    }

    public void setCorreo(String correo) {
        if (correo.contains("@")){
            System.out.println("su correo "+correo+" es valido");
        }else{
            System.out.println("su correo "+correo+" es invalido");
        }
    }

    public void setNotaFinal(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaFinal = nota;
        } else {
            System.out.println("Nota invalida. Debe estar entre 0.0 y 5.0.");
        }
    }

    public boolean aprobo() {
        return notaFinal >= 3.5;
    }

    public String setDocumento(String documento) {
        this.documento = documento;
        return documento;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
}