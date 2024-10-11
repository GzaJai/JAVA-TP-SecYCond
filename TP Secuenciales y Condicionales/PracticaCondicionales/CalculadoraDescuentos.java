import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discEstudent = 0.1;
        double discAdult = 0.05;
        double discRetiree = 0.15;
        double finalPrice = 0;

        System.out.println("Ingrese el precio del producto: ");
        double price = sc.nextDouble();

        System.out.println("Ingrese la categoria del cliente: ");
        String category = sc.next();

        if(category.equals("Jubilado")){
            finalPrice = price - price * discRetiree;
        } else if (category.equals("Estudiante")) {
            finalPrice = price - price * discEstudent;
        } else if (category.equals("Adulto")) {
            finalPrice = price - price * discAdult;
        };

        if (finalPrice!=0) {
            System.out.println("El precio con descuento es: " + finalPrice);
        } else {
            System.out.println("Categoria desconocida");
        };
    }
}
