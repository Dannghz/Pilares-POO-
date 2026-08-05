public class AprendisSena extends Empleado {

    public AprendisSena(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase*= 0.5;
    }
}
