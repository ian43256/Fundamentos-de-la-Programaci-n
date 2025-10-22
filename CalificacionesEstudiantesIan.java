import java.util.Scanner;

public class CalificacionesEstudiantesIan {
    static Scanner sc = new Scanner(System.in);
    static double[][] calificaciones;
    static double[] promedios;
    static boolean datosIngresados = false;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenu de Calificaciones");
            System.out.println("1. Ingresar calificaciones");
            System.out.println("2. Mostrar promedio de cada estudiante");
            System.out.println("3. Mostrar estudiantes con promedio entre 9 y 10");
            System.out.println("4. Mostrar estudiantes con promedio inferior a 7");
            System.out.println("5. Mostrar examen con promedio más alto");
            System.out.println("6. Mostrar examen con promedio más bajo");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCalificaciones();
                    break;
                case 2:
                    if (datosIngresados) mostrarPromedios();
                    else System.out.println("Primero debes ingresar las calificaciones.");
                    break;
                case 3:
                    if (datosIngresados) mejoresEstudiantes();
                    else System.out.println("Primero debes ingresar las calificaciones.");
                    break;
                case 4:
                    if (datosIngresados) estudiantesReprobados();
                    else System.out.println("Primero debes ingresar las calificaciones.");
                    break;
                case 5:
                    if (datosIngresados) examenMasAlto();
                    else System.out.println("Primero debes ingresar las calificaciones.");
                    break;
                case 6:
                    if (datosIngresados) examenMasBajo();
                    else System.out.println("Primero debes ingresar las calificaciones.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    // op1
    static void ingresarCalificaciones() {
        System.out.print("Ingrese la cantidad de estudiantes (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese la cantidad de exámenes (M): ");
        int m = sc.nextInt();

        calificaciones = new double[n][m];
        promedios = new double[n];

        System.out.println("\nIngreso de calificaciones");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < m; j++) {
                System.out.print("  Calificación del examen " + (j + 1) + ": ");
                double nota = sc.nextDouble();
                while (nota < 0 || nota > 10) {
                    System.out.print("Calificación inválida. Ingrese un valor entre 0 y 10: ");
                    nota = sc.nextDouble();
                }
                calificaciones[i][j] = nota;
                suma += nota;
            }
            promedios[i] = suma / m;
        }

        datosIngresados = true;
        System.out.println("Calificaciones ingresadas correctamente.");
    }

    // op2
    static void mostrarPromedios() {
        System.out.println("\nPromedio de cada estudiante");
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("Estudiante %d → Promedio: %.2f\n", (i + 1), promedios[i]);
        }
    }

    // op3
    static void mejoresEstudiantes() {
        System.out.println("\nEstudiantes con promedio entre 9 y 10");
        boolean encontrado = false;
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                encontrado = true;
                System.out.printf("Estudiante %d → Promedio: %.2f\n", (i + 1), promedios[i]);
            }
        }
        if (!encontrado) System.out.println("Ningún estudiante tiene promedio entre 9 y 10.");
    }

    // op4
    static void estudiantesReprobados() {
        System.out.println("\nEstudiantes con promedio menor a 7");
        boolean encontrado = false;
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] < 7) {
                encontrado = true;
                System.out.printf("Estudiante %d → Promedio: %.2f\n", (i + 1), promedios[i]);
            }
        }
        if (!encontrado) System.out.println("Ningún estudiante tiene promedio menor a 7.");
    }

    // op5
    static void examenMasAlto() {
        int m = calificaciones[0].length;
        int n = calificaciones.length;
        double mayorPromedio = -1;
        int examenMayor = -1;

        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                examenMayor = j;
            }
        }
        System.out.printf("El examen con promedio más alto es el #%d con promedio de %.2f\n",
                examenMayor + 1, mayorPromedio);
    }

    // op6
    static void examenMasBajo() {
        int m = calificaciones[0].length;
        int n = calificaciones.length;
        double menorPromedio = 11;
        int examenMenor = -1;

        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                examenMenor = j;
            }
        }
        System.out.printf("El examen con promedio más bajo es el #%d con promedio de %.2f\n",
                examenMenor + 1, menorPromedio);
    }
}
