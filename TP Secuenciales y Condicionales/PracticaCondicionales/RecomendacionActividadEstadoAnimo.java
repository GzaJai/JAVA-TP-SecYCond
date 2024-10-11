import java.util.Scanner;

public class RecomendacionActividadEstadoAnimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String mood = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación

        recommendActivity(mood);
    }

    public static void recommendActivity(String mood) {
        String recommendation = "\n--- Recomendación de actividad basada en tu estado de ánimo ---\n";

        switch (mood) {
            case "feliz":
                recommendation += "😊 Te recomendamos salir a caminar al aire libre o disfrutar de una película divertida.\n";
                break;
            case "triste":
                recommendation += "😢 Te sugerimos escuchar música relajante o hablar con un amigo cercano.\n";
                break;
            case "enérgico":
                recommendation += "💪 Parece que tienes mucha energía. ¡Haz ejercicio o participa en un deporte que te guste!\n";
                break;
            case "relajado":
                recommendation += "🌿 Disfruta de una buena lectura o meditación para mantener tu tranquilidad.\n";
                break;
            default:
                recommendation = "Estado de ánimo no reconocido. Por favor, ingresa 'feliz', 'triste', 'enérgico' o 'relajado'.";
                break;
        }

        System.out.println(recommendation);
    }
}
