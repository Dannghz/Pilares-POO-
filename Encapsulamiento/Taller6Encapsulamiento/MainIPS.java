package Encapsulamiento.Taller6Encapsulamiento;

public class MainIPS {

    public static void main(String[] args) {

        // Crear paciente
        Paciente paciente = new Paciente(
            "123456789",
            "Carlos Pérez",
            35,
            "O+",
            "Hipertensión"
        );

        // ==================================
        // INFORMACIÓN PÚBLICA
        // ==================================

        System.out.println("===== INFORMACIÓN DEL PACIENTE =====");
        System.out.println("Documento: " + paciente.getDocumento());
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Tipo de sangre: " + paciente.getTipoSangre());

        // ==================================
        // INTENTO CON CLAVE INCORRECTA
        // ==================================

        System.out.println("\n===== CONSULTA CON CLAVE INCORRECTA =====");

        String diagnostico = paciente.consultarDiagnostico("1234");

        System.out.println("Resultado: " + diagnostico);

        // ==================================
        // CONSULTA CON CLAVE CORRECTA
        // ==================================

        System.out.println("\n===== CONSULTA CON CLAVE CORRECTA =====");

        diagnostico = paciente.consultarDiagnostico("MED-2026");

        System.out.println("Diagnóstico: " + diagnostico);

        // ==================================
        // AGREGAR ALERGIAS
        // ==================================

        System.out.println("\n===== ALERGIAS =====");

        paciente.agregarAlergia("Penicilina");
        paciente.agregarAlergia("Polen");

        paciente.mostrarAlergias();

        System.out.println("¿Tiene alergias?: "
                + paciente.tieneAlergias());

        // ==================================
        // ACTUALIZAR DIAGNÓSTICO
        // ==================================

        System.out.println("\n===== ACTUALIZAR DIAGNÓSTICO =====");

        boolean actualizado = paciente.actualizarDiagnostico(
            "MED-2026",
            "Hipertensión controlada"
        );

        if (actualizado) {
            System.out.println("Diagnóstico actualizado correctamente.");
        } else {
            System.out.println("No se pudo actualizar el diagnóstico.");
        }

        // ==================================
        // MOSTRAR DIAGNÓSTICO ACTUAL
        // ==================================

        System.out.println("\nDiagnóstico actual: "
                + paciente.consultarDiagnostico("MED-2026"));
    }
}