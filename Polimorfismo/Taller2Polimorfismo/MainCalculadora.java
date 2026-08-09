package Polimorfismo.Taller2Polimorfismo;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] miArreglo={1,2,3,4,5};
        System.out.println("2 + 3 = " + calc.sumar(2, 3));
        System.out.println("1 + 2 + 3 = " + calc.sumar(1, 2, 3));
        System.out.println("2.5 + 3.7 = " + calc.sumar(2.5, 3.7));
        System.out.println("3 + 3.3 = " + calc.sumar(3, 3.3));
        System.out.println(" 1+2+3+4+5 = " + calc.sumar(miArreglo));
    }
}
