import java.util.Scanner;

public class GeneradorPlanEstudio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = sc.nextInt();

        generarPlanEstudio(horasPorDia);
    }

    public static void generarPlanEstudio(int horasPorDia) {
        String[] materias = {"Matemáticas", "Arquitectura y Sistemas Operativos", "Organización Empresarial", "Python", "Programación"};

        String plan = "\n--- Plan de estudio semanal ---\n";

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        for (int i = 0; i < diasSemana.length; i++) {
            String materiaAsignada = materias[i % materias.length];
            plan += diasSemana[i] + ": Estudiar " + materiaAsignada + " (" + horasPorDia + " horas)\n";
        }

        System.out.println(plan);
    }
}

