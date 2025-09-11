import java.util.Scanner;

public class MesesDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String nombreMes = "";
        int dias = 0;

        do {
            System.out.print("Ingrese un número de mes (1-12): ");
            mes = sc.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Número inválido. Intente de nuevo.");
            }
        } while (mes < 1 || mes > 12);

        switch (mes) {
            case 1: nombreMes = "Enero"; dias = 31; break;
            case 2: nombreMes = "Febrero"; dias = 28; break;
            case 3: nombreMes = "Marzo"; dias = 31; break;
            case 4: nombreMes = "Abril"; dias = 30; break;
            case 5: nombreMes = "Mayo"; dias = 31; break;
            case 6: nombreMes = "Junio"; dias = 30; break;
            case 7: nombreMes = "Julio"; dias = 31; break;
            case 8: nombreMes = "Agosto"; dias = 31; break;
            case 9: nombreMes = "Septiembre"; dias = 30; break;
            case 10: nombreMes = "Octubre"; dias = 31; break;
            case 11: nombreMes = "Noviembre"; dias = 30; break;
            case 12: nombreMes = "Diciembre"; dias = 31; break;
        }

        System.out.println("El mes es " + nombreMes + " y tiene " + dias + " días.");

        sc.close();
    }
}
