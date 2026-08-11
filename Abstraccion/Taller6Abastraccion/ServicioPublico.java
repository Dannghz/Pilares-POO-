package Abstraccion.Taller6Abastraccion;

public abstract class ServicioPublico {

    protected int numeroContrato;
    protected String titular;
    protected double consumo;

    public ServicioPublico(int numeroContrato, String titular, double consumo) {
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumo = consumo;
    }

    // Cada servicio debe definir su propia fórmula
    public abstract double calcularFactura();

    // Método concreto reutilizable
    public void emitirRecibo() {
        System.out.println("================================");
        System.out.println("RECIBO DE SERVICIO PÚBLICO");
        System.out.println("Contrato: " + numeroContrato);
        System.out.println("Titular: " + titular);
        System.out.println("Consumo: " + consumo);
        System.out.println("Total a pagar: $" + calcularFactura());
        System.out.println("================================");
    }
}