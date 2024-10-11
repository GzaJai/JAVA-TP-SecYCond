import java.util.Scanner;

public class GeneradorRutinas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = sc.nextLine().toLowerCase();

        generarRutina(nivel);
    }

    public static void generarRutina(String nivel) {
        String rutina = "\n--- Rutina semanal para nivel " + nivel + " ---\n";

        switch (nivel) {
            case "principiante":
                rutina += "Lunes: Caminar (30 minutos)\n" +
                        "Martes: Estiramientos (20 minutos)\n" +
                        "Miércoles: Bicicleta (30 minutos)\n" +
                        "Jueves: Descanso\n" +
                        "Viernes: Yoga (20 minutos)\n" +
                        "Sábado: Caminar (40 minutos)\n" +
                        "Domingo: Descanso";
                break;

            case "intermedio":
                rutina += "Lunes: Correr (45 minutos)\n" +
                        "Martes: Entrenamiento de fuerza (30 minutos)\n" +
                        "Miércoles: Bicicleta (45 minutos)\n" +
                        "Jueves: HIIT (20 minutos)\n" +
                        "Viernes: Natación (30 minutos)\n" +
                        "Sábado: Caminata intensa (60 minutos)\n" +
                        "Domingo: Descanso activo (30 minutos de estiramientos)";
                break;

            case "avanzado":
                rutina += "Lunes: Correr (60 minutos)\n" +
                        "Martes: Entrenamiento de fuerza (60 minutos)\n" +
                        "Miércoles: Bicicleta (60 minutos)\n" +
                        "Jueves: HIIT (30 minutos)\n" +
                        "Viernes: Natación (45 minutos)\n" +
                        "Sábado: Entrenamiento de circuito (60 minutos)\n" +
                        "Domingo: Descanso activo (45 minutos de yoga)";
                break;

            default:
                rutina = "Nivel no reconocido. Por favor ingresa 'principiante', 'intermedio' o 'avanzado'.";
                break;
        }

        System.out.println(rutina);
    }
}
