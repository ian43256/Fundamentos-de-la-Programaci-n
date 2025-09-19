import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes desea capturar?: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] estudiantes = new String[n];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();
        }

        System.out.println("\nLISTA DE ESTUDIANTES");
        for (String nombre : estudiantes) {
            int caracteres = nombre.length();

            if (nombre.equals(nombre.toLowerCase())) {
                System.out.println("- " + nombre.toUpperCase() + " (caracteres: " + caracteres + ")");
            } else if (nombre.equals(nombre.toUpperCase())) {
                System.out.println("- " + nombre.toLowerCase() + " (caracteres: " + caracteres + ")");
            } else {
                System.out.println("- " + nombre + " (caracteres: " + caracteres + ")");
            }
        }

        sc.close();
    }
}
