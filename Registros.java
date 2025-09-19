import java.util.Scanner;

public class Registros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("¿Cuántos estudiantes desea capturar?: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] promedios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Estudiante " + (i + 1) + " ===");
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();

            System.out.print("Edad: ");
            edades[i] = sc.nextInt();

            System.out.print("Promedio: ");
            promedios[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nLISTADO DE ESTUDIANTES");
        System.out.printf("%-20s %-10s %-10s\n", "Nombre", "Edad", "Promedio");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10d %-10.2f\n", nombres[i], edades[i], promedios[i]);
        }

        sc.close();
    }
}
