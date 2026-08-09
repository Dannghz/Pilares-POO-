package Herencia.Taller4Herencia;

public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0; // Sera sobrescrito por las hijas
    }

    public String getColor() {
        return color;
    }

    public void descrivir() {
        System.out.println("Figura de color: " + color + " y area: " + calcularArea());
    }
}