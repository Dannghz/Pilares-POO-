package Polimorfismo.Taller5Polimorfismo;

public class MainTransporte {
    public static void main(String[] args) {
        Vehiculo[] flota = {
                new Bus("BUS-001"),
                new Taxi("TAX-555"),
                new Bicicleta("BIC-777"),
                new Bus("BUS-002"),
                new MotoTaxi("123-fhg")
        };
        // Polimorfismo: cada uno responde a su manera
        for (Vehiculo v : flota) {
            v.mover();
            // instanceof + casting para acceder a metodos propios de Bus
            if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.abrirPuertas();
            }

            if (v instanceof MotoTaxi){
                MotoTaxi m = (MotoTaxi) v;
                m.recogerpasajero();
            }
        }
    }
}
