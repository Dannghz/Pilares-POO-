package Polimorfismo.Taller6Polimorfismo;

public abstract class Reserva {
    protected String cliente; 

    public Reserva(String cliente) {
        this.cliente = cliente;
    }

    // Método que todas las hijas deberán sobreescribir
    public abstract double calcularPrecio();
    
    public String getCliente() {
        return cliente;
    }
}