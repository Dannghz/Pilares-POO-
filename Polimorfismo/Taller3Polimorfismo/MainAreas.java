package Polimorfismo.Taller3Polimorfismo;

public class MainAreas {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Cuadrado(4),
                new Circulo(3),
                new Triangulo(5, 6),
                new Rectangulo(5, 6)
        };
        double areaTotal = 0;
        double areaMayor = 0;
        for (Figura f : figuras) {
            double area = f.calcularArea();
            System.out.println("Area parcial: " + area);
            areaTotal += area;
            if( area > areaMayor ){
                areaMayor=area;
            }
        }

        System.out.println("Area mayor: " + areaMayor);

        System.out.println("AREA TOTAL: " + areaTotal);
    }
}
