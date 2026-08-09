package Herencia.Taller4Herencia;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 3, 4);
        c.descrivir();
        r.descrivir();
        t.descrivir();
    }
}