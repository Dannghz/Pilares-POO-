package Polimorfismo.Taller5Polimorfismo;

public class MotoTaxi extends Vehiculo{
    public MotoTaxi(String placa) {
        super(placa);
    }

    @Override
    public void mover() {
        System.out.println("Moto taxi " + placa + " avanza ");
    }

    public void recogerpasajero (){
        System.out.println("moto Taxi " + placa +" transporta a 1 pasajero por la ciudad.");
    }
}
