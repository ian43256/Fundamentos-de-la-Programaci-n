import java.util.Scanner;

public class TransporteIan {
    static Scanner sc = new Scanner(System.in);
    static int choferes = 5;
    static int dias = 6;
    static String[] nombres = new String[choferes];
    static int[][] horas = new int[choferes][dias];
    static double[] sueldoHora = new double[choferes];
    static String[] descanso = new String[choferes];
    static boolean datosIngresados = false;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nPrograma de Transportes:");
            System.out.println("1. Registrar datos de choferes");
            System.out.println("2. Calcular total de horas trabajadas");
            System.out.println("3. Calcular sueldo semanal de cada chofer");
            System.out.println("4. Calcular total a pagar por la empresa");
            System.out.println("5. Chofer que más trabaja el día lunes");
            System.out.println("6. Mostrar reporte general");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarDatos();
                    break;
                case 2:
                    if (verificarDatos()) calcularHoras();
                    break;
                case 3:
                    if (verificarDatos()) calcularSueldo();
                    break;
                case 4:
                    if (verificarDatos()) totalEmpresa();
                    break;
                case 5:
                    if (verificarDatos()) masHorasLunes();
                    break;
                case 6:
                    if (verificarDatos()) reporte();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);
    }

    static boolean verificarDatos() {
        if (!datosIngresados) {
            System.out.println("Primero debe registrar los datos de los choferes (opción 1).");
            return false;
        }
        return true;
    }
    
    static void registrarDatos() {
    sc.nextLine(); 
    String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    dias = 7;
    horas = new int[choferes][dias];

    for (int i = 0; i < choferes; i++) {
        System.out.println("\nRegistro del chofer #" + (i + 1) + " ---");
        System.out.print("Nombre: ");
        nombres[i] = sc.nextLine();

        System.out.print("Día de descanso (Lunes a Domingo): ");
        descanso[i] = sc.nextLine();

        System.out.println("Ingrese las horas trabajadas por día (lunes a domingo):");
        for (int j = 0; j < dias; j++) {
            if (diasSemana[j].equalsIgnoreCase(descanso[i])) {
                horas[i][j] = 0;
                System.out.println(diasSemana[j] + " es su día de descanso. Horas = 0");
            } else {
                System.out.print(diasSemana[j] + ": ");
                horas[i][j] = sc.nextInt();
            }
        }

        System.out.print("Sueldo por hora: $");
        sueldoHora[i] = sc.nextDouble();
        sc.nextLine(); 
    }

    datosIngresados = true;
    System.out.println("\nDatos registrados correctamente");
}
    
    static void calcularHoras() {
        System.out.println("\nTotal de horas Trabajadas");
        for (int i = 0; i < choferes; i++) {
            int total = 0;
            for (int j = 0; j < dias; j++) {
                total += horas[i][j];
            }
            System.out.println(nombres[i] + " trabajó " + total + " horas esta semana.");
        }
    }
    
    static void calcularSueldo() {
        System.out.println("\nSueldo semanal de cada chofer: ");
        for (int i = 0; i < choferes; i++) {
            int totalHoras = 0;
            for (int j = 0; j < dias; j++) {
                totalHoras += horas[i][j];
            }
            double sueldoSemanal = totalHoras * sueldoHora[i];
            System.out.println(nombres[i] + " gana $" + sueldoSemanal + " esta semana.");
        }
    }
    
    static void totalEmpresa() {
        double totalGeneral = 0;
        for (int i = 0; i < choferes; i++) {
            int totalHoras = 0;
            for (int j = 0; j < dias; j++) {
                totalHoras += horas[i][j];
            }
            totalGeneral += totalHoras * sueldoHora[i];
        }
        System.out.println("\nEl total a pagar por la empresa es: $" + totalGeneral);
    }
    
    static void masHorasLunes() {
    int maxHoras = -1;
    String chofer = "Ninguno";

    for (int i = 0; i < choferes; i++) {
        if (!descanso[i].equalsIgnoreCase("Lunes")) {
            if (horas[i][0] > maxHoras) {
                maxHoras = horas[i][0];
                chofer = nombres[i];
            }
        }
    }

    if (maxHoras == -1) {
        System.out.println("\nTodos los choferes descansaron el lunes.");
    } else {
        System.out.println("\nEl chofer que más trabajó el lunes es: " + chofer + " con " + maxHoras + " horas.");
    }
}
    
    static void reporte() {
        System.out.println("\nReporte General");
        System.out.println("Nombre\t\tLunes\tMar\tMiér\tJue\tVie\tSáb\tTotalHoras\tSueldo/Hora\tDescanso\tSueldoSemanal");

        double totalGeneral = 0;

        for (int i = 0; i < choferes; i++) {
            int totalHoras = 0;
            for (int j = 0; j < dias; j++) {
                totalHoras += horas[i][j];
            }
            double sueldoSemanal = totalHoras * sueldoHora[i];
            totalGeneral += sueldoSemanal;

            System.out.print(nombres[i] + "\t");
            for (int j = 0; j < dias; j++) {
                System.out.print(horas[i][j] + "\t");
            }
            System.out.println(totalHoras + "\t\t$" + sueldoHora[i] + "\t\t" + descanso[i] + "\t\t$" + sueldoSemanal);
        }
        
        System.out.println("Total que tiene que pagar la empresa: $" + totalGeneral);
    }
}