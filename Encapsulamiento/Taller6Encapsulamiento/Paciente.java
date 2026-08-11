package Encapsulamiento.Taller6Encapsulamiento;

import java.util.ArrayList;

public class Paciente {

    // Todos los atributos son privados
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;

    // Información sensible: no tiene getter público
    private String diagnostico;

    // Clave privada del médico
    private final String claveMedico = "MED-2026";

    // Arreglo/lista de alergias
    private ArrayList<String> alergias;

    public Paciente(String documento, String nombre, int edad, String tipoSangre,
                    String diagnostico) {

        this.documento = documento;
        this.nombre = nombre;
        this.alergias = new ArrayList<>();

        setEdad(edad);
        setTipoSangre(tipoSangre);

        this.diagnostico = diagnostico;
    }

    // =========================
    // GETTERS
    // =========================

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    // NO existe getDiagnostico()
    // porque el diagnóstico es información confidencial.

    // =========================
    // SETTERS
    // =========================

    public void setDocumento(String documento) {
        if (documento != null && !documento.isEmpty()) {
            this.documento = documento;
        } else {
            System.out.println("Documento no válido.");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 0 y 120.");
        }
    }

    public void setTipoSangre(String tipoSangre) {

        String[] tiposPermitidos = {
            "A+", "A-", "B+", "B-",
            "O+", "O-", "AB+", "AB-"
        };

        boolean valido = false;

        for (String tipo : tiposPermitidos) {
            if (tipo.equals(tipoSangre)) {
                valido = true;
                break;
            }
        }

        if (valido) {
            this.tipoSangre = tipoSangre;
        } else {
            System.out.println("Tipo de sangre no válido.");
        }
    }

    // =========================
    // DIAGNÓSTICO
    // =========================

    public String consultarDiagnostico(String claveMedico) {

        if (claveMedico != null && claveMedico.equals(claveMedicoInterna())) {
            return diagnostico;
        }

        return "Acceso denegado.";
    }

    private String claveMedicoInterna() {
        return claveMedico;
    }

    public boolean actualizarDiagnostico(String claveMedico,
                                         String nuevoDiagnostico) {

        if (claveMedico != null && claveMedico.equals(claveMedicoInterna())) {

            if (nuevoDiagnostico != null && !nuevoDiagnostico.isEmpty()) {
                this.diagnostico = nuevoDiagnostico;
                return true;
            }
        }

        return false;
    }

    // =========================
    // ALERGIAS
    // =========================

    public void agregarAlergia(String alergia) {

        if (alergia != null && !alergia.isEmpty()) {
            alergias.add(alergia);
        }
    }

    public boolean tieneAlergias() {
        return !alergias.isEmpty();
    }

    public void mostrarAlergias() {

        if (alergias.isEmpty()) {
            System.out.println("Alergias: Ninguna registrada.");
        } else {
            System.out.println("Alergias:");

            for (String alergia : alergias) {
                System.out.println("- " + alergia);
            }
        }
    }
}
