import java.util.Scanner;

public class SaludoHoraDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        char continuar;

        do {

            do {
                System.out.print("Ingrese la hora (0-23): ");
                hora = sc.nextInt();

                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Intente de nuevo.");
                }
            } while (hora < 0 || hora > 23);
           
            if (hora >= 6 && hora <= 12) {
                System.out.println("¡Buenos días!");
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("¡Buenas tardes!");
            } else {
                System.out.println("¡Buenas noches!");
            }

            System.out.print("¿Desea ingresar otra hora? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
