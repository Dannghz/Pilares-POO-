package Taller3Abstraccion;

public class Lavadora extends Electrodomestico {

    public Lavadora(String marca) {
            super(marca);
        }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Lavando ropa a 40 grados C por 45 minutos...");
        } else {
            System.out.println("Enciendala primero.");
        }
    }
}
