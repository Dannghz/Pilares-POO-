public class MainEmpresa {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Ana Lopez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Ruiz", "5678", 3000000, 800000);
        AprendisSena a = new AprendisSena("Maria Gomez", "9012", 1500000);

        v.mostrarInfo();

        System.out.println("---");

        g.mostrarInfo();

        System.out.println("---");

        a.mostrarInfo();
    }
}
