import java.util.Scanner;

public class EntradasCineDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {

            int personas;
            do {
                System.out.print("Ingresa el número de personas: ");
                personas = sc.nextInt();
                if (personas <= 0) {
                    System.out.println("Número inválido. Intente de nuevo.");
                }
            } while (personas <= 0);

            sc.nextLine();

            String dia;
            do {
                System.out.print("Ingresa el día de la semana: ");
                dia = sc.nextLine().toLowerCase();
                if (!(dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("miercoles") ||
                      dia.equals("jueves") || dia.equals("viernes") || dia.equals("sábado") || dia.equals("sabado") ||
                      dia.equals("domingo"))) {
                    System.out.println("Día inválido. Intente de nuevo.");
                }
            } while (!(dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("miercoles") ||
                       dia.equals("jueves") || dia.equals("viernes") || dia.equals("sábado") || dia.equals("sabado") ||
                       dia.equals("domingo")));

            String membresiaStr;
            boolean tieneMembresia;
            do {
                System.out.print("¿Tienes membresía? (si/no): ");
                membresiaStr = sc.nextLine().toLowerCase();
                if (!membresiaStr.equals("si") && !membresiaStr.equals("no")) {
                    System.out.println("Respuesta inválida. Intente de nuevo.");
                }
            } while (!membresiaStr.equals("si") && !membresiaStr.equals("no"));

            tieneMembresia = membresiaStr.equals("si");

            double precioTotal = 0;

            switch(dia) {
                case "miercoles":
                    precioTotal = personas * 30;
                    break;

                case "jueves":
                    int parejas = personas / 2;
                    int individuales = personas % 2;
                    precioTotal = parejas * 75 + individuales * 50;
                    break;

                default:
                    precioTotal = personas * 50;
            }

            if (tieneMembresia) {
                precioTotal *= 0.9;
            }

            System.out.println("El precio total de las entradas es: $" + precioTotal);

            System.out.print("¿Desea calcular otra compra? (s/n): ");
            continuar = sc.next().charAt(0);
            sc.nextLine(); 

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
