package Polimorfismo.Taller2Polimorfismo;

public class Calculadora {
    // Suma de 2 enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de 3 enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma de 2 decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Concatenacion de cadenas
    public String sumar(String a, String b) {
        return a + " " + b;
    }

    public double sumar(int a , double b){
        return a+b;
    }
    
    public static int sumar(int [] numeros){
        int suma=0;
        for(int num : numeros){
            suma+=num;
        }
        return suma;
    }

    

}
