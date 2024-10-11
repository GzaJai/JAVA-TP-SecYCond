import java.util.Scanner;

public class RecomendacionPelicula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu género de película favorito (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        recomendarPelicula(genero);
    }

    public static void recomendarPelicula(String genero) {
        String recomendacion = "\n--- Recomendación de película para el género " + genero + " ---\n";

        switch (genero) {
            case "acción":
                recomendacion += "Te recomendamos ver: Mad Max: Fury Road\n";
                break;
            case "comedia":
                recomendacion += "Te recomendamos ver: The Grand Budapest Hotel\n";
                break;
            case "drama":
                recomendacion += "Te recomendamos ver: The Pursuit of Happyness\n";
                break;
            case "ciencia ficción":
                recomendacion += "Te recomendamos ver: Interstellar\n";
                break;
            default:
                recomendacion = "Género no reconocido. Por favor ingresa 'acción', 'comedia', 'drama' o 'ciencia ficción'.";
                break;
        }

        System.out.println(recomendacion);
    }
}
