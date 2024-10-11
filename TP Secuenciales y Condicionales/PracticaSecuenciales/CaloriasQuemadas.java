import java.util.Scanner;

public class CaloriasQuemadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight, duration;
        String exercise;

        System.out.print("Ingrese el ejercicio realizado: ");
        exercise = sc.nextLine();

        System.out.print("Ingrese el peso corporal en kilogramos: ");
        weight = sc.nextInt();
        System.out.print("Ingrese la duracion del ejercicio en minutos: ");
        duration = sc.nextInt();

        System.out.print("Usted quemó " + getBurnedCalories(weight, duration, exercise) + "Kcal");
    }

    public static double getCaloriesBurnedPerKg(String exercise) {
        switch (exercise) {
            case "Caminar" -> {
                return 0.035;
            }
            case "Correr" -> {
                return 0.09;
            }
            case "Bicicleta" -> {
                return 0.07;
            }
            case "Nadar" -> {
                return 0.1;
            }
            case "Saltar" -> {
                return 0.13;
            }
            case "Ciclismo" -> {
                return 0.12;
            }
            case "Gimnasio" -> {
                return 0.05;
            }
            case "Yoga" -> {
                return 0.03;
            }
            case "Baile" -> {
                return 0.06;
            }
            case "HIIT" -> {
                return 0.014;
            }
            default -> {
                return 0;
            }
        }
    }

    public static float getBurnedCalories(int weight, int duration, String exercise) {
        double calories = getCaloriesBurnedPerKg(exercise);
        return (float) calories * weight * duration;
    }
}
