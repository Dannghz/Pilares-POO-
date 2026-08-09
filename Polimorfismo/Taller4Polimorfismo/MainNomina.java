package Polimorfismo.Taller4Polimorfismo;

public class MainNomina {
    public static void main(String[] args) {
        Empleado[] nomina = {
                new EmpleadoTiempoCompleto("Ana", 2500000),
                new EmpleadoTiempoCompleto("Luis", 3100000),
                new EmpleadoFreelance("Sofia", 4, 800000),
                new EmpleadoFreelance("Carlos", 2, 1200000),
                new EmpleadoPorHoras("Santiagao", 8, 1200000),
                new EmpleadoPorHoras("ruben", 2, 1200000)
        };
        double totalNomina = 0;
        for (Empleado e : nomina) {
            double pago = e.calcularSalario();
            System.out.println(e.getNombre() + ": $" + pago);
            totalNomina += pago;
        }
        System.out.println("TOTAL NOMINA: $" + totalNomina);
    }
}