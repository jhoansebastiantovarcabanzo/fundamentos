package codigo_Hospital;

import java.time.LocalDate;

public class Hospital {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // ===================== PACIENTE 1 =====================
        Paciente paciente = new Paciente(
            1001,
            "Carlos Andrés Gómez",
            45,
            "Masculino",
            "Cáncer de pulmón",
            "Etapa II",
            "En tratamiento"
        );

        Tratamiento tratamiento = new Tratamiento(
            1001,
            "Quimioterapia",
            120,
            "Náuseas, caída del cabello"
        );

        Examenes examen = new Examenes(
            1001,
            LocalDate.of(2024, 5, 20),
            "Radiografía",
            "Reducción del tumor"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== PACIENTE 2 =====================
        paciente = new Paciente(
            1002,
            "María López",
            38,
            "Femenino",
            "Cáncer de mama",
            "Etapa III",
            "En tratamiento"
        );

        tratamiento = new Tratamiento(
            1002,
            "Quimioterapia intensiva",
            150,
            "Fatiga, náuseas"
        );

        examen = new Examenes(
            1002,
            LocalDate.of(2024, 6, 10),
            "Mamografía",
            "Disminución parcial del tumor"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== PACIENTE 3 =====================
        paciente = new Paciente(
            1003,
            "Luis Fernández",
            60,
            "Masculino",
            "Leucemia",
            "Etapa IV",
            "Crítico"
        );

        tratamiento = new Tratamiento(
            1003,
            "Inmunoterapia",
            180,
            "Fiebre, dolores articulares, diarrea"
        );

        examen = new Examenes(
            1003,
            LocalDate.of(2024, 7, 5),
            "Biopsia de médula ósea",
            "Alta presencia de blastos"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== PACIENTE 4 =====================
        paciente = new Paciente(
            1004,
            "Laura Sofía Martínez",
            29,
            "Femenino",
            "Cáncer de tiroides",
            "Etapa I",
            "En tratamiento"
        );

        tratamiento = new Tratamiento(
            1004,
            "Cirugía y terapia hormonal",
            90,
            "Dolor leve"
        );

        examen = new Examenes(
            1004,
            LocalDate.of(2024, 6, 15),
            "Ecografía tiroidea",
            "Nódulo reducido"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== PACIENTE 5 =====================
        paciente = new Paciente(
            1005,
            "Andrés Felipe Torres",
            55,
            "Masculino",
            "Cáncer de próstata",
            "Etapa II",
            "En tratamiento"
        );

        tratamiento = new Tratamiento(
            1005,
            "Radioterapia",
            100,
            "Fatiga"
        );

        examen = new Examenes(
            1005,
            LocalDate.of(2024, 8, 10),
            "PSA",
            "Mejorando"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== PACIENTE 6 =====================
        paciente = new Paciente(
            1006,
            "Camila Rodríguez",
            41,
            "Femenino",
            "Cáncer de piel",
            "Etapa I",
            "En remisión"
        );

        tratamiento = new Tratamiento(
            1006,
            "Cirugía láser",
            30,
            "Enrojecimiento leve"
        );

        examen = new Examenes(
            1006,
            LocalDate.of(2024, 9, 2),
            "Dermatoscopia",
            "Sin células malignas"
        );

        sistema.registrarPaciente(paciente);
        sistema.agregarTratamiento(tratamiento);
        sistema.agregarExamen(examen);


        // ===================== RESULTADOS =====================
        sistema.contarPacientes();
        sistema.calcularPorcentajePorEstado("En tratamiento");

        System.out.println("\n=== CONSULTA ===\n");

        sistema.mostrarPaciente(1001);
        sistema.mostrarPaciente(1002);
        sistema.mostrarPaciente(1003);
        sistema.mostrarPaciente(1004);
        sistema.mostrarPaciente(1005);
        sistema.mostrarPaciente(1006);
    }
}