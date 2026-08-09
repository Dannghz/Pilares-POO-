package Encapsulamiento.Taller4Encapsulamiento;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");
        System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());
        v.acelerar();
        v.acelerar();
        v.acelerar();
        v.frenar();
        v.getKilometrajeTotal();
        v.reset();
        System.out.println("Velocidad final: " + v.getVelocidad() + " km/h");
    }
}
