import java.util.Scanner;

public class RecomendacionLibro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        recomendarLibro(genero);
    }

    public static void recomendarLibro(String genero) {
        String recomendacion = "\n--- Recomendación de libro para el género " + genero + " ---\n";

        switch (genero) {
            case "fantasía":
                recomendacion += "Te recomendamos leer: El Señor de los Anillos - J.R.R. Tolkien\n";
                break;
            case "misterio":
                recomendacion += "Te recomendamos leer: El Código Da Vinci - Dan Brown\n";
                break;
            case "romance":
                recomendacion += "Te recomendamos leer: Orgullo y Prejuicio - Jane Austen\n";
                break;
            case "ciencia ficción":
                recomendacion += "Te recomendamos leer: Dune - Frank Herbert\n";
                break;
            default:
                recomendacion = "Género no reconocido. Por favor ingresa 'fantasía', 'misterio', 'romance' o 'ciencia ficción'.";
                break;
        }

        System.out.println(recomendacion);
    }
}
