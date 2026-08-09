package Taller4Abstraccion;

public class PagoPSE extends MedioPago {
        private String banco;

    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Validando redireccion al " + banco + "...");
        System.out.println(" Esperando confirmacion.....");
        System.out.println("Pago aprobado.");
    }
}

