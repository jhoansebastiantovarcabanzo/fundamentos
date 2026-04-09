package codigo_Hospital;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Paciente> pacientes;
    private ArrayList<Examenes> examenes;
    private ArrayList<Tratamiento> tratamientos;

    public Sistema() {
        this.pacientes    = new ArrayList<>();
        this.examenes     = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente) {
        for (Paciente p : pacientes) {
            if (p.getIdentificacion() == paciente.getIdentificacion()) {
                System.out.println("Error: Ya existe un paciente con ID "
                        + paciente.getIdentificacion());
                return;
            }
        }
        pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNombre() + " registrado correctamente.");
    }

    public void agregarExamen(Examenes examen) {
        Paciente p = buscarPaciente(examen.getIdentifiacion());
        if (p == null) {
            System.out.println("Error: No existe paciente con ID "
                    + examen.getIdentifiacion());
            return;
        }
        examenes.add(examen);
        System.out.println("Examen '" + examen.getTipoExamen()
                + "' agregado al paciente " + p.getNombre() + ".");
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        Paciente p = buscarPaciente(tratamiento.getIdentificacion());
        if (p == null) {
            System.out.println("Error: No existe paciente con ID "
                    + tratamiento.getIdentificacion());
            return;
        }
        tratamientos.add(tratamiento);
        System.out.println("Tratamiento '" + tratamiento.getnombreTratamiento()
                + "' agregado al paciente " + p.getNombre() + ".");
    }

    public int contarPacientes() {
        System.out.println("Total de pacientes registrados: " + pacientes.size());
        return pacientes.size();
    }

    public double calcularPorcentajePorEstado(String estado) {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return 0.0;
        }
        int contador = 0;
        for (Paciente p : pacientes) {
            if (p.getEstadoActual().equalsIgnoreCase(estado)) {
                contador++;
            }
        }
        double porcentaje = (contador * 100.0) / pacientes.size();
        System.out.printf("Pacientes en estado '%s': %d (%.2f%%)%n",
                estado, contador, porcentaje);
        return porcentaje;
    }

    public Paciente buscarPaciente(int id) {
        for (Paciente p : pacientes) {
            if (p.getIdentificacion() == id) {
                return p;
            }
        }
        return null;
    }

    public void mostrarPaciente(int id) {
        Paciente p = buscarPaciente(id);
        if (p == null) {
            System.out.println("Paciente con ID " + id + " no encontrado.");
            return;
        }

        System.out.println("========================================");
        System.out.println("INFORMACIÓN DEL PACIENTE");
        System.out.println("========================================");
        System.out.println(p);

        System.out.println("\n--- Exámenes ---");
        boolean tieneExamen = false;
        for (Examenes e : examenes) {
            if (e.getIdentifiacion() == id) {
                System.out.println(e);
                tieneExamen = true;
            }
        }
        if (!tieneExamen) System.out.println("Sin exámenes registrados.");

        System.out.println("\n--- Tratamientos ---");
        boolean tieneTratamiento = false;
        for (Tratamiento t : tratamientos) {
            if (t.getIdentificacion() == id) {
                System.out.println(t);
                System.out.println("Eficacia: " + t.calcularEficacia(p.getEtapa()));
                tieneTratamiento = true;
            }
        }
        if (!tieneTratamiento) System.out.println("Sin tratamientos registrados.");
        System.out.println("========================================");
    }
}