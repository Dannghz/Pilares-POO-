package Encapsulamiento.Taller4Encapsulamiento;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int velocidad;
    private double kilometrajeTotal;
    private static final int VEL_MAX = 200;
    private static final int VEL_MIN = 0;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.kilometrajeTotal = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void getKilometrajeTotal() {
        System.out.println("Kilometraje total: " + kilometrajeTotal + " km");
    }
    public void acelerar() {
        if (velocidad + 10 <= VEL_MAX) {
            velocidad += 10;
            kilometrajeTotal += velocidad * 0.1; // Incrementa el kilometraje en 0.1 km por cada aceleración
            System.out.println("Velocidad: " + velocidad + " km/h");
        } else {
            System.out.println("No puede superar " + VEL_MAX + " km/h.");
        }
    }



    public void frenar() {
        if (velocidad - 10 >= VEL_MIN) {
            velocidad -= 10;
            System.out.println("Velocidad: " + velocidad + " km/h");
        } else {
            velocidad = 0;
            System.out.println("Vehiculo detenido.");
        }
    }

    public void reset(){
        velocidad =0;
        System.out.println("Vehiculo detenido."); 
    }
}