package Polimorfismo.Taller6Polimorfismo;

public class ReservaBusIntermunicipal extends Reserva {
    private String origen;
    private String destino;
    private double precioFijo;

    public ReservaBusIntermunicipal(String cliente, String origen, String destino, double precioFijo) {
        super(cliente);
        this.origen = origen;
        this.destino = destino;
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularPrecio() {
        // Precio fijo por ruta
        return precioFijo;
    }
    
    public String getRuta() {
        return origen + " - " + destino;
    }
}
