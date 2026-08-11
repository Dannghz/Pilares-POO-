package Herencia.Taller6Herencia;

public class Administrativo extends PersonalIPS {

    private String area;

    public Administrativo(String documento, String nombre, double salarioBase,
                          String area) {

        super(documento, nombre, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Administrativo");
        System.out.println("Área: " + area);
    }
}