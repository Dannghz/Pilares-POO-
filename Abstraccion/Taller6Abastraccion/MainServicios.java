package Abstraccion.Taller6Abastraccion;

public class MainServicios {

    public static void main(String[] args) {

        ServicioPublico agua = new Agua(1001, "Carlos", 15);
        ServicioPublico luz = new Luz(1002, "Carlos", 250);
        ServicioPublico gas = new Gas(1003, "Carlos", 12);

        agua.emitirRecibo();
        luz.emitirRecibo();
        gas.emitirRecibo();

        // Esto produce error porque ServicioPublico es abstracta:
        // ServicioPublico servicio = new ServicioPublico(...);
    }
}
