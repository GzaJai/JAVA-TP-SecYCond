import java.util.Scanner;

public class IndiceFelicidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, califica los siguientes factores en una escala del 1 al 10:");

        System.out.print("Nivel de satisfacción con la vida: ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Nivel de estrés: ");
        int nivelEstres = scanner.nextInt();

        System.out.print("Nivel de salud: ");
        int nivelSalud = scanner.nextInt();

        System.out.print("Relaciones personales: ");
        int relacionesPersonales = scanner.nextInt();

        System.out.print("Balance entre vida personal y trabajo: ");
        int balanceVidaTrabajo = scanner.nextInt();

        double indiceFelicidad = calcularIndiceFelicidad(satisfaccionVida, nivelEstres, nivelSalud, relacionesPersonales, balanceVidaTrabajo);

        System.out.printf("\nTu índice de felicidad es: %.2f\n", indiceFelicidad);
    }

    public static double calcularIndiceFelicidad(int satisfaccionVida, int nivelEstres, int nivelSalud, int relacionesPersonales, int balanceVidaTrabajo) {
        int nivelEstresInverso = 10 - nivelEstres;

        double sumaFactores = satisfaccionVida + nivelEstresInverso + nivelSalud + relacionesPersonales + balanceVidaTrabajo;

        return sumaFactores / 5.0;
    }
}
