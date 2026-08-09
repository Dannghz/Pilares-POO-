package Polimorfismo.Taller4Polimorfismo;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private int tarifaPorhora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, int tarifaPorhora) {
        super(nombre);
        this.horasTrabajadas =horasTrabajadas;
        this.tarifaPorhora = tarifaPorhora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorhora;
    }
}
