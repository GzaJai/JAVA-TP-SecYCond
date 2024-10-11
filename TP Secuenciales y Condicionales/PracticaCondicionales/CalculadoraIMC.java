import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("\nTu IMC es: %.2f\n", imc);

        proporcionarRecomendacion(imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void proporcionarRecomendacion(double imc) {
        String recomendacion;

        if (imc < 18.5) {
            recomendacion = "Tienes bajo peso. Se recomienda una dieta más calórica y consultar a un profesional de la salud.";
        } else if (imc >= 18.5 && imc < 24.9) {
            recomendacion = "Tienes un peso normal. Mantén una alimentación balanceada y actividad física regular.";
        } else if (imc >= 25 && imc < 29.9) {
            recomendacion = "Tienes sobrepeso. Considera una dieta equilibrada y aumentar tu nivel de actividad física.";
        } else {
            recomendacion = "Tienes obesidad. Es importante consultar a un profesional de la salud para recibir asesoramiento adecuado.";
        }

        System.out.println(recomendacion);
    }
}
