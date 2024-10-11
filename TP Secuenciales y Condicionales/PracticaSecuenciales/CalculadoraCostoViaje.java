import java.util.Scanner;

public class CalculadoraCostoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distance, gasPrice, litersPerKilometer;

        System.out.println("Ingrese el distancia del viaje: ");
        distance = sc.nextFloat();
        System.out.println("Ingrese el precio de combustible por litro: ");
        gasPrice = sc.nextFloat();
        System.out.println("Ingrese el consumo de combustible por kilometro: ");
        litersPerKilometer = sc.nextFloat();

        float tripCost = (distance * gasPrice) * litersPerKilometer;
        System.out.println("El costo del viaje es: " + tripCost);

    }
}
