import java.util.Scanner;

public class EvaluacionHabitosSaludables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas duermes al día? ");
        int sleepHours = scanner.nextInt();

        System.out.print("¿Cuántas horas haces ejercicio al día? ");
        int exerciseHours = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int healthyMeals = scanner.nextInt();

        evaluateHabits(sleepHours, exerciseHours, healthyMeals);
    }

    public static void evaluateHabits(int sleepHours, int exerciseHours, int healthyMeals) {
        String evaluation = "\n--- Evaluación de tus hábitos saludables ---\n";

        if (sleepHours >= 7 && sleepHours <= 9) {
            evaluation += "✔ Dormir entre 7 y 9 horas al día es ideal para una buena salud.\n";
        } else if (sleepHours < 7) {
            evaluation += "✘ Dormir menos de 7 horas puede afectar tu salud. Intenta dormir más.\n";
        } else {
            evaluation += "✘ Dormir más de 9 horas puede no ser saludable. Considera ajustar tu horario de sueño.\n";
        }

        if (exerciseHours >= 1) {
            evaluation += "✔ Hacer al menos 1 hora de ejercicio al día es excelente para mantenerte activo.\n";
        } else {
            evaluation += "✘ Hacer menos de 1 hora de ejercicio al día puede ser insuficiente. Intenta aumentar tu actividad física.\n";
        }

        if (healthyMeals >= 3) {
            evaluation += "✔ Consumir 3 o más comidas saludables al día es ideal para una buena nutrición.\n";
        } else {
            evaluation += "✘ Consumir menos de 3 comidas saludables al día puede no ser suficiente. Intenta mejorar tu dieta.\n";
        }

        System.out.println(evaluation);
    }
}
