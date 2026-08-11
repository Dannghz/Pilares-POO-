package Abstraccion.Taller6Abastraccion;

public class Gas extends ServicioPublico {

    public Gas(int numeroContrato, String titular, double consumo) {
        super(numeroContrato, titular, consumo);
    }

    @Override
    public double calcularFactura() {
        return (consumo * 2100) + 5000;
    }
}
