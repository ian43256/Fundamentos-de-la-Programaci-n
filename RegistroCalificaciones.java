import java.util.Scanner;

public class RegistroCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones desea capturar?: ");
        int n = sc.nextInt();

        double[] calificaciones = new double[n];
        int reprobadas = 0; 
        String listaReprobadas = ""; 

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();

            if (calificaciones[i] < 7) {
                reprobadas++;
                listaReprobadas += calificaciones[i] + " ";
            }
        }

        System.out.println("\nCALIFICACIONES CAPTURADAS");
        for (double c : calificaciones) {
            System.out.print(c + " ");
        }

        if (reprobadas > 0) {
            System.out.println("\n\nHay " + reprobadas + " calificación(es) reprobatoria(s).");
            System.out.println("Calificaciones reprobatorias: " + listaReprobadas);
        } else {
            System.out.println("\n\nNo hay calificaciones reprobatorias.");
        }

        sc.close();
    }
}
