import java.util.Scanner;

public class HoroscopoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes;
        char continuar;

        do {
           
            do {
                System.out.print("Ingrese el mes de nacimiento (1-12): ");
                mes = sc.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("Mes inválido. Intente de nuevo.");
                }
            } while (mes < 1 || mes > 12);

            do {
                System.out.print("Ingrese el día de nacimiento: ");
                dia = sc.nextInt();
                if (dia < 1 || dia > 31) {
                    System.out.println("Día inválido. Intente de nuevo.");
                }
            } while (dia < 1 || dia > 31);

            String signo = "";

            switch (mes) {
                case 1:
                    signo = (dia <= 20) ? "Capricornio" : "Acuario"; break;
                case 2:
                    signo = (dia <= 19) ? "Acuario" : "Piscis"; break;
                case 3:
                    signo = (dia <= 20) ? "Piscis" : "Aries"; break;
                case 4:
                    signo = (dia <= 20) ? "Aries" : "Tauro"; break;
                case 5:
                    signo = (dia <= 21) ? "Tauro" : "Géminis"; break;
                case 6:
                    signo = (dia <= 21) ? "Géminis" : "Cáncer"; break;
                case 7:
                    signo = (dia <= 22) ? "Cáncer" : "Leo"; break;
                case 8:
                    signo = (dia <= 23) ? "Leo" : "Virgo"; break;
                case 9:
                    signo = (dia <= 23) ? "Virgo" : "Libra"; break;
                case 10:
                    signo = (dia <= 23) ? "Libra" : "Escorpio"; break;
                case 11:
                    signo = (dia <= 22) ? "Escorpio" : "Sagitario"; break;
                case 12:
                    signo = (dia <= 21) ? "Sagitario" : "Capricornio"; break;
            }

            System.out.println("Tu signo zodiacal es: " + signo);

            System.out.print("¿Desea ingresar otra fecha? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
