package codigo_Hospital;

import java.time.LocalDate;

/**
 * Clase principal del sistema de gestión hospitalaria.
 * 
 * Permite crear pacientes, asignarles tratamientos y exámenes,
 * y mostrar la información en consola.
 * 
 * @author 
 */
public class Hospital {

    /**
     * Método principal donde se ejecuta el programa.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // ===================== PACIENTE 1 =====================
        /**
         * Creación del paciente 1 con sus datos básicos
         */
        Paciente p1 = new Paciente(
            1001,
            "Carlos Andrés Gómez",
            45,
            "Masculino",
            "Cáncer de pulmón",
            "Etapa II",
            "En tratamiento"
        );

        /**
         * Tratamiento asociado al paciente 1
         */
        Tratamiento t1 = new Tratamiento(
            1001,
            "Quimioterapia",
            120,
            "Náuseas, fatiga, pérdida de cabello"
        );

        /**
         * Exámenes realizados al paciente 1
         */
        Examenes e1 = new Examenes(
            1001,
            LocalDate.of(2024, 3, 10),
            "Tomografía computarizada",
            "Tumor reducido un 30%"
        );

        // ===================== PACIENTE 2 =====================
        Paciente p2 = new Paciente(
            1002,
            "María Lucía Herrera",
            62,
            "Femenino",
            "Cáncer de mama",
            "Etapa I",
            "En remisión"
        );

        Tratamiento t2 = new Tratamiento(
            1002,
            "Radioterapia",
            60,
            "Enrojecimiento en piel, cansancio leve"
        );

        Examenes e2 = new Examenes(
            1002,
            LocalDate.of(2024, 5, 22),
            "Mamografía",
            "Sin evidencia de células malignas activas"
        );

        // ===================== PACIENTE 3 =====================
        Paciente p3 = new Paciente(
            1003,
            "Jorge Esteban Ramírez",
            38,
            "Masculino",
            "Leucemia linfoblástica aguda",
            "Etapa III",
            "Crítico"
        );

        Tratamiento t3 = new Tratamiento(
            1003,
            "Inmunoterapia",
            180,
            "Fiebre, dolores articulares, diarrea"
        );

        Examenes e3 = new Examenes(
            1003,
            LocalDate.of(2024, 7, 5),
            "Biopsia de médula ósea",
            "Alta presencia de blastos, requiere seguimiento inmediato"
        );

        // ===================== PACIENTE 4 =====================
        Paciente p4 = new Paciente(
            1004,
            "Laura Sofía Martínez",
            29,
            "Femenino",
            "Cáncer de tiroides",
            "Etapa I",
            "En tratamiento"
        );

        Tratamiento t4 = new Tratamiento(
            1004,
            "Cirugía y terapia hormonal",
            90,
            "Dolor leve, cambios hormonales"
        );

        Examenes e4 = new Examenes(
            1004,
            LocalDate.of(2024, 6, 15),
            "Ecografía tiroidea",
            "Nódulo reducido significativamente"
        );

        // ===================== PACIENTE 5 =====================
        Paciente p5 = new Paciente(
            1005,
            "Andrés Felipe Torres",
            55,
            "Masculino",
            "Cáncer de próstata",
            "Etapa II",
            "En tratamiento"
        );

        Tratamiento t5 = new Tratamiento(
            1005,
            "Radioterapia",
            100,
            "Fatiga, dificultad urinaria"
        );

        Examenes e5 = new Examenes(
            1005,
            LocalDate.of(2024, 8, 10),
            "PSA",
            "Niveles disminuyendo progresivamente"
        );

        // ===================== PACIENTE 6 =====================
        Paciente p6 = new Paciente(
            1006,
            "Camila Rodríguez",
            41,
            "Femenino",
            "Cáncer de piel",
            "Etapa I",
            "En remisión"
        );

        Tratamiento t6 = new Tratamiento(
            1006,
            "Cirugía láser",
            30,
            "Enrojecimiento leve"
        );

        Examenes e6 = new Examenes(
            1006,
            LocalDate.of(2024, 9, 2),
            "Dermatoscopia",
            "Sin presencia de células malignas"
        );

        // ===================== IMPRESIÓN =====================
        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTIÓN HOSPITALARIA");
        System.out.println("========================================\n");

        mostrarPaciente(p1, t1, e1, 1);
        mostrarPaciente(p2, t2, e2, 2);
        mostrarPaciente(p3, t3, e3, 3);
        mostrarPaciente(p4, t4, e4, 4);
        mostrarPaciente(p5, t5, e5, 5);
        mostrarPaciente(p6, t6, e6, 6);
    }

    /**
     * Método auxiliar para mostrar la información completa de un paciente.
     * 
     * @param p paciente
     * @param t tratamiento asociado
     * @param e examen realizado
     * @param numero número del paciente
     */
    public static void mostrarPaciente(Paciente p, Tratamiento t, Examenes e, int numero) {
        System.out.println(">>> PACIENTE " + numero + " <<<");
        System.out.println(p);
        System.out.println(t);
        System.out.println("Eficacia del tratamiento: " + t.calcularEficacia(p.getEtapa()));
        System.out.println(e);
        System.out.println();
    }
}
  