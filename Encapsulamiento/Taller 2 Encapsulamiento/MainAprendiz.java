public class MainAprendiz {
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("123456789", "Juan Perez", "juan.perez@example.com");
        a.setEdad(19);
        a.setNotaFinal(4.2);
        a.setNotaFinal(7.0);
        a.setCorreo("juan.perez@example.com");
        System.out.println("Aprendiz: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota: " + a.getNotaFinal());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}