import java.util.Scanner;

public class GeneradorPlaylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();

        generarListaReproduccion(estadoAnimo);
    }

    public static void generarListaReproduccion(String estadoAnimo) {
        String playlist = "\n--- Lista de reproducción para estado de ánimo " + estadoAnimo + " ---\n";

        switch (estadoAnimo) {
            case "feliz":
                playlist += "1. Happy - Pharrell Williams\n" +
                        "2. Uptown Funk - Mark Ronson ft. Bruno Mars\n" +
                        "3. Can't Stop the Feeling - Justin Timberlake\n" +
                        "4. Walking on Sunshine - Katrina and the Waves\n" +
                        "5. Good as Hell - Lizzo\n";
                break;

            case "triste":
                playlist += "1. Someone Like You - Adele\n" +
                        "2. Fix You - Coldplay\n" +
                        "3. The Night We Met - Lord Huron\n" +
                        "4. When I Was Your Man - Bruno Mars\n" +
                        "5. Stay With Me - Sam Smith\n";
                break;

            case "enérgico":
                playlist += "1. Eye of the Tiger - Survivor\n" +
                        "2. Lose Yourself - Eminem\n" +
                        "3. We Will Rock You - Queen\n" +
                        "4. Thunderstruck - AC/DC\n" +
                        "5. Don't Stop Me Now - Queen\n";
                break;

            case "relajado":
                playlist += "1. Weightless - Marconi Union\n" +
                        "2. Bloom - The Paper Kites\n" +
                        "3. River Flows In You - Yiruma\n" +
                        "4. Ocean Eyes - Billie Eilish\n" +
                        "5. Breathe Me - Sia\n";
                break;

            default:
                playlist = "Estado de ánimo no reconocido. Por favor ingresa 'feliz', 'triste', 'enérgico' o 'relajado'.";
                break;
        }

        System.out.println(playlist);
    }
}
