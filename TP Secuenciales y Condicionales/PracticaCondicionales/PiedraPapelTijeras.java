import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] options = {"Piedra", "Papel", "Tijeras"};

        System.out.print("Seleccione una opcion (Papel, Piedra, Tijeras): ");
        String playerOption = sc.nextLine();

        String result = getWinner(getPcOption(options), playerOption);
        System.out.println(result);

    }
    public static String getWinner(String pcOption, String playerOption){

        String message = "";
        String pcWins = "Ganó la PC";
        String playerWins = "Ganó el jugador";

        if (pcOption.equals(playerOption)){
            message = "Empate";
        } else if (playerOption.equals("Piedra")){
            if (pcOption.equals("Papel")){
                message = pcWins;
            } else if (pcOption.equals("Tijeras")){
                message = playerWins;
            }
        } else if (playerOption.equals("Papel")){
            if (pcOption.equals("Tijeras")){
                message = pcWins;
            } else if (pcOption.equals("Piedra")){
                message = playerWins;
            }
        } else if (playerOption.equals("Tijeras")){
            if (pcOption.equals("Piedra")){
                message = pcWins;
            } else if (pcOption.equals("Papel")){
                message = playerWins;
            }
        }

        return message;
    }
    public static String getPcOption(String[] options){

        int randomNum = ThreadLocalRandom.current().nextInt(0, options.length + 1);

        return options[randomNum];
    }
}
