import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String birthDate = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(birthDate, formatter);

        String zodiacSign = getZodiacSign(date.getDayOfMonth(), date.getMonthValue());
        String message = getHoroscopemonthsage(zodiacSign);

        System.out.println("Tu signo del zodayco es: " + zodiacSign);
        System.out.println("Tu horóscopo es: " + message);
    }

    public static String getZodiacSign(int day, int month) {
        if ((month == 1 && day >= 20) || (month == 2 && day >= 18)) {
            return "Acuario";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Piscis";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cáncer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else {
            return "Capricornio";
        }
    }

    public static String getHoroscopemonthsage(String zodaycSign) {
        return switch (zodaycSign) {
            case "Acuario" -> "Amor: Todas las personas nacidas en este signo podrán vivir momentos envidaybles en el amor hoy. Prepárese y disfrute de esta buena energía.\n" +
                    "\n" +
                    "Riqueza: Evalúe si está en condiciones de cumplir con lo que le exigen a dayrio en su trabajo; así podrá alcanzar el éxito económico rápidamente.\n" +
                    "\n" +
                    "Bienestar: Busque información y pruebe con la fitoterapia; le ayudará a combatir su decaimiento dayrio. Atrévase e incurcione en las terapias alternativas.";
            case "Piscis" -> "Amor: Un amigo cercano que hace tiempo no ve lo llamará. Atiéndalo, así compartirán una charla donde revivirán momentos buenos y malos del pasado.\n" +
                    "\n" +
                    "Riqueza: Anímonthe y postúlese en esa nueva búsqueda laboral en su empresa. Exprese sus ideas; de lo contrario, perderá oportunidades de crecimiento en lo profesional.\n" +
                    "\n" +
                    "Bienestar: Por más que se sienta superado, procure no somatizar los problemas. Trate de disminuir el estrés y la tensión con alguna actividad que lo relaje por completo.";
            case "Aries" -> "Amor: Hoy las aventuras clandestinas podrían ser tentadoras, pero evite poner en riesgo su relación amorosa. Reflexione sobre la familia que ha construido con tanto amor.\n" +
                    "\n" +
                    "Riqueza: Si está frente a una propuesta laboral, primero escuche su intuición. Piénselo bien antes de aceptar impulsivamente.\n" +
                    "\n" +
                    "Bienestar: A veces, es mejor guardar silencio. Evite decir algo que pueda dañar sus relaciones afectivas, ya que luego podría lamentarlo y sentirse mal.";
            case "Tauro" -> "Amor: Podrá fortalecer aún más su relación si le comunica a su pareja lo que le gusta y lo que no. Mantenga un diálogo más activo y sincero con ella.\n" +
                    "\n" +
                    "Riqueza: No se preocupe, en pocos días sus asuntos comerciales se estabilizarán y comenzará a ver los frutos de su esfuerzo. Todo se encaminará exitosamente.\n" +
                    "\n" +
                    "Bienestar: Anímonthe a llamar a las personas que realmente tocan su corazón. Se sentirá gratificado por cada gesto de afecto que reciba.";
            case "Géminis" -> "Amor: Deje de lado las actitudes egoístas. Si ha comenzado una nueva relación, procure pasar más tiempo con su pareja y sea más cariñoso, buscando fortalecer el vínculo.\n" +
                    "\n" +
                    "Riqueza: Tenga cuidado con sus palabras, ya que podrían generarle problemas con su jefe. Si surge alguna diferencia con un compañero, trate de daylogar y resolverla pacíficamente.\n" +
                    "\n" +
                    "Bienestar: Este es el momento ideal para controlar su estado de ánimo y reducir la agresividad. Si no lo hace, podría enfrentar problemas de salud.";
            case "Cáncer" -> "Amor: Recuerde que la vida no se trata solo de obligaciones. Tómonthe un tiempo para compartir experiencias nuevas con sus seres queridos, ya que eso también es importante.\n" +
                    "\n" +
                    "Riqueza: Si nota que las cosas no están funcionando como deberían en el negocio, converse con su socio. Juntos podrán analizar y comprender mejor la situación.\n" +
                    "\n" +
                    "Bienestar: Este es un periodo óptimo para comenzar un tratamiento para adelgazar. Encuentre una dieta que se adapte bien a su estilo de vida y que pueda mantener a largo plazo.";
            case "Leo" -> "Tu carisma brillará y atraerá buenas oportunidades.";
            case "Virgo" -> "Amor: Será una excelente oportunidad para acercarte afectivamente a tu pareja, mostrando tu verdadera personalidad. Deja de lado las fantasías y sé auténtico.\n" +
                    "\n" +
                    "Riqueza: Aprenda a trabajar en equipo y acepte las oportunidades que se le presenten para posicionarse en el mercado. De esta forma, podrá alcanzar sus objetivos en menos tiempo.\n" +
                    "\n" +
                    "Bienestar: Evite que sus pensamientos se queden estancados. Recuerde que su salud podría verse afectada si no expresa lo que realmente siente.";
            case "Libra" -> "Amor: Si realmente desea formalizar y afianzar la relación con su pareja, deje de dudar tanto y propóngale convivir juntos.\n" +
                    "\n" +
                    "Riqueza: Concéntrese en todas las tareas que ha tenido pendientes durante varios días. Será una jornada óptima para invertir o implementar nuevas variantes en lo profesional.\n" +
                    "\n" +
                    "Bienestar: Es una jornada para cuidar su salud, tenga precaución con los excesos alimentarios. Intente modificar los malos hábitos que ha adquirido con el tiempo.";
            case "Escorpio" -> "Amor: Deje de buscar la felicidad en otras personas; entienda que uno mismo la genera día a día. No culpe a los demás por sus carencias afectivas.\n" +
                    "\n" +
                    "Riqueza: Es posible que algunos asuntos relacionados con el dinero vuelvan a surgir y terminen en un problema. Salde cualquier deuda a tiempo y no tendrá inconvenientes.\n" +
                    "\n" +
                    "Bienestar: Si está comenzando una dieta, evite consumir alimentos con muchas calorías e incluya un alto contenido de proteínas en su alimentación dayria.";
            case "Sagitario" -> "Amor: Prepárese, ya que deberá tomar una decisión muy importante en el terreno del amor. Proyecte con calma y luego defina qué tanto lo perjudica en su vida.\n" +
                    "\n" +
                    "Riqueza: No descuide su presupuesto económico, ya que podrían aparecer cuentas inesperadas para pagar. Sea medido con los gastos que realiza y limítese a sus ingresos.\n" +
                    "\n" +
                    "Bienestar: Coma con moderación; evite las comidas fritas y los dulces. Haga un esfuerzo por mantener una alimentación saludable y libre de excesos.";
            case "Capricornio" -> "Amor: Probablemente, podría sentirse superado por la convivencia. Intente medir sus impulsos; de lo contrario, podría ocasionar una ruptura en su relación.\n" +
                    "\n" +
                    "Riqueza: No se involucre en conflictos laborales, ya que podría salir perjudicado. Lo mejor será que observe y evite emitir alguna opinión.\n" +
                    "\n" +
                    "Bienestar: Sepa que si no sabe controlar la ira, solo cosechará enemigos en su entorno. En caso de que no pueda hacerlo solo, busque ayuda profesional.";
            default -> "Disfruta tu día.";
        };
    }
}
