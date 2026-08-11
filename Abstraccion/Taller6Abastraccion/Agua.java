package Abstraccion.Taller6Abastraccion;

public class Agua extends ServicioPublico {

    public Agua(int numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return (consumo * 3500) + 8000;
    }
}