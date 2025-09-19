import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones desea capturar?: ");
        int n = sc.nextInt();

        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];

            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("\nCALIFICACIONES CAPTURADAS");
        for (double c : calificaciones) {
            System.out.print(c + " ");
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        sc.close();
    }
}
