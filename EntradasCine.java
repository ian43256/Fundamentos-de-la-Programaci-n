import java.util.Scanner;

public class EntradasCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de personas: ");
        int personas = sc.nextInt();

        System.out.print("Ingresa el día de la semana: ");
        sc.nextLine();

        String dia = sc.nextLine().toLowerCase();

        System.out.print("¿Tienes membresía? (si/no): ");
        String membresiaStr = sc.nextLine().toLowerCase();
        boolean tieneMembresia = membresiaStr.equals("si");

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
        sc.close();
    }
}