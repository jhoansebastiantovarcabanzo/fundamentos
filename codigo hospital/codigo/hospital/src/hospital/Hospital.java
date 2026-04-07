package hospital;

import java.time.LocalDate;

public class Hospital {

    public static void main(String[] args) {

        Paciente p1 = new Paciente(
            1001,
            "Carlos Andrés Gómez",
            45,
            "Masculino",
            "Cáncer de pulmón",
            "Etapa II",
            "En tratamiento"
        );
        Tratamiento t1 = new Tratamiento(
            1001,
            "Quimioterapia",
            120,
            "Náuseas, fatiga, pérdida de cabello"
        );
        Examenes e1 = new Examenes(
            1001,
            LocalDate.of(2024, 3, 10),
            "Tomografía computarizada",
            "Tumor reducido un 30%"
        );
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
        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTIÓN HOSPITALARIA");
        System.out.println("========================================\n");

        System.out.println(">>> PACIENTE 1 <<<");
        System.out.println(p1);
        System.out.println(t1);
        System.out.println("Eficacia del tratamiento: " + t1.calcularEficacia(p1.getEtapa()));
        System.out.println(e1);

        System.out.println(">>> PACIENTE 2 <<<");
        System.out.println(p2);
        System.out.println(t2);
        System.out.println("Eficacia del tratamiento: " + t2.calcularEficacia(p2.getEtapa()));
        System.out.println(e2);

        System.out.println(">>> PACIENTE 3 <<<");
        System.out.println(p3);
        System.out.println(t3);
        System.out.println("Eficacia del tratamiento: " + t3.calcularEficacia(p3.getEtapa()));
        System.out.println(e3);
    }
}