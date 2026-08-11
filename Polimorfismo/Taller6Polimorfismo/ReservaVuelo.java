package Polimorfismo.Taller6Polimorfismo;

public class ReservaVuelo extends Reserva {
    private boolean internacional;
    private double distanciaKm;

    public ReservaVuelo(String cliente, boolean internacional, double distanciaKm) {
        super(cliente);
        this.internacional = internacional;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcularPrecio() {
        // Precio = distancia * 500 + $150.000
        return (distanciaKm * 500) + 150000;
    }

    // Método propio de esta clase
    public boolean esInternacional() {
        return internacional;
    }
}