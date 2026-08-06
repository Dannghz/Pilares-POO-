package Taller2Abstraccion;

public class MainNomina {
    public static void main(String[] args) {

        EmpleadoFijo ef = new EmpleadoFijo("Ana Rios", "1111", 2200000);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Luis Mora", "2222", 80, 15000);
        EmpleadoFreelance efreelance = new EmpleadoFreelance("Maria Gomez", "3333", 5, 20000);

        ef.mostrarRecibo();
        System.out.println("---");
        eh.mostrarRecibo();
        System.out.println("---");
        efreelance.mostrarRecibo();
    }
}