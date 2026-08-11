package Abstraccion.Taller6Abastraccion;

public class Luz extends ServicioPublico {

    public Luz(int numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return (consumo * 650) + 12000;
    }
}