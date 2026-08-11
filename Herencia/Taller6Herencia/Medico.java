package Herencia.Taller6Herencia;

public class Medico extends PersonalIPS {

    private String especialidad;
    private int consultasDelMes;

    public Medico(String documento, String nombre, double salarioBase,
                   String especialidad, int consultasDelMes) {

        super(documento, nombre, salarioBase);
        this.especialidad = especialidad;
        this.consultasDelMes = consultasDelMes;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + (consultasDelMes * 500000);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Médico");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Consultas del mes: " + consultasDelMes);
    }
}