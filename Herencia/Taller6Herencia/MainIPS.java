package Herencia.Taller6Herencia;

public class MainIPS {

    public static void main(String[] args) {

        Medico medico = new Medico(
            "123456",
            "Carlos Pérez",
            3000000,
            "Cardiología",
            20
        );

        Enfermero enfermero = new Enfermero(
            "654321",
            "Ana López",
            2200000,
            "noche"
        );

        Administrativo administrativo = new Administrativo(
            "987654",
            "Luis Gómez",
            2000000,
            "Facturación"
        );

        System.out.println("===== MÉDICO =====");
        medico.mostrarInfo();

        System.out.println("\n===== ENFERMERO =====");
        enfermero.mostrarInfo();

        System.out.println("\n===== ADMINISTRATIVO =====");
        administrativo.mostrarInfo();
    }
}