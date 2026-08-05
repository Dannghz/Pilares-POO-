public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println(
                    "Deposito exitoso de $" + cantidad + " a la cuenta " + numeroCuenta + " titular: " + titular);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }

    public void transferir(CuentaBancaria cuentaDestino, CuentaBancaria remitente, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente para la transferencia.");
        } else {
            saldo -= cantidad;
            System.out.println(
                    "iniciando transferencia de $" + cantidad + " de la cuenta titular:" + remitente.getTitular()
                            + " a la cuenta del titular:" + cuentaDestino.getTitular());
            cuentaDestino.depositar(cantidad);
        }
    }
}