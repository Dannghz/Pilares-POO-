public class App {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria cuenta2 = new CuentaBancaria("002-234", "Daniel Perez");

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo inicial: $" + cuenta2.getSaldo());

        cuenta.depositar(500000);
        cuenta2.depositar(500000);


        cuenta.transferir(cuenta2, cuenta, 200000);
        System.out.println("Saldo final de " + cuenta.getTitular() + ": $" + cuenta.getSaldo());
        System.out.println("Saldo final de " + cuenta2.getTitular() + ": $" + cuenta2.getSaldo());

    }
}
