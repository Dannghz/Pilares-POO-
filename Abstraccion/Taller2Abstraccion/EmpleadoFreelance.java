package Taller2Abstraccion;

public class EmpleadoFreelance extends Empleado {
    private int NumProyectos;
    private double PagoPorProyecto;

    public EmpleadoFreelance(String nombre, String documento, int NumProyectos, double PagoPorProyecto) {
        super(nombre, documento);
        this.NumProyectos = NumProyectos;
        this.PagoPorProyecto = PagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        return NumProyectos * PagoPorProyecto;
    }
}