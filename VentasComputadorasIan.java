import java.util.Scanner;

public class VentasComputadorasIan {
    static Scanner sc = new Scanner(System.in);
    static int vendedores;
    static int zonas;
    static int[][] ventas; 
    static double precioComputadora; 
    static boolean datosIngresados = false;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nVenta de Computadoras");
            System.out.println("1. Registrar datos de ventas");
            System.out.println("2. Mostrar zona que más computadoras vendió");
            System.out.println("3. Mostrar vendedor que menos computadoras vendió");
            System.out.println("4. Mostrar vendedor que más computadoras vendió");
            System.out.println("5. Mostrar total de computadoras vendidas");
            System.out.println("6. Mostrar reporte general");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarDatos();
                    break;
                case 2:
                    if (verificarDatos()) zonaMasVentas();
                    break;
                case 3:
                    if (verificarDatos()) vendedorMenosVentas();
                    break;
                case 4:
                    if (verificarDatos()) vendedorMasVentas();
                    break;
                case 5:
                    if (verificarDatos()) totalGeneral();
                    break;
                case 6:
                    if (verificarDatos()) reporte();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema de ventas");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese nuevamente.");
            }
        } while (opcion != 7);
    }

    static boolean verificarDatos() {
        if (!datosIngresados) {
            System.out.println("Debe registrar primero los datos (opción 1).");
            return false;
        }
        return true;
    }

    static void registrarDatos() {
        System.out.print("\nIngrese la cantidad de vendedores: ");
        vendedores = sc.nextInt();

        System.out.print("Ingrese la cantidad de zonas: ");
        zonas = sc.nextInt();

        ventas = new int[vendedores][zonas];

        System.out.print("Ingrese el precio de cada computadora: $");
        precioComputadora = sc.nextDouble();

        for (int i = 0; i < vendedores; i++) {
            System.out.println("\n--- Vendedor #" + (i + 1) + " ---");
            for (int j = 0; j < zonas; j++) {
                System.out.print("Computadoras vendidas en la zona " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }

        datosIngresados = true;
        System.out.println("\nDatos registrados correctamente.");
    }

    static void zonaMasVentas() {
        int zonaMax = 0;
        int maxVenta = 0;

        for (int j = 0; j < zonas; j++) {
            int totalZona = 0;
            for (int i = 0; i < vendedores; i++) {
                totalZona += ventas[i][j];
            }
            if (totalZona > maxVenta) {
                maxVenta = totalZona;
                zonaMax = j;
            }
        }

        System.out.println("\nLa zona que más computadoras vendió fue la zona #" + (zonaMax + 1)
                + " con un total de " + maxVenta + " computadoras vendidas.");
    }

    static void vendedorMenosVentas() {
        int vendedorMin = 0;
        int minVentas = Integer.MAX_VALUE;

        for (int i = 0; i < vendedores; i++) {
            int totalVendedor = 0;
            for (int j = 0; j < zonas; j++) {
                totalVendedor += ventas[i][j];
            }
            if (totalVendedor < minVentas) {
                minVentas = totalVendedor;
                vendedorMin = i;
            }
        }

        double ventaTotal = minVentas * precioComputadora;

        System.out.println("\nEl vendedor que MENOS computadoras vendió fue el #" + (vendedorMin + 1)
                + " con " + minVentas + " computadoras. Venta total: $" + ventaTotal);
    }

    static void vendedorMasVentas() {
        int vendedorMax = 0;
        int maxVentas = -1;

        for (int i = 0; i < vendedores; i++) {
            int totalVendedor = 0;
            for (int j = 0; j < zonas; j++) {
                totalVendedor += ventas[i][j];
            }
            if (totalVendedor > maxVentas) {
                maxVentas = totalVendedor;
                vendedorMax = i;
            }
        }

        double ventaTotal = maxVentas * precioComputadora;

        System.out.println("\nEl vendedor que MÁS computadoras vendió fue el #" + (vendedorMax + 1)
                + " con " + maxVentas + " computadoras. Venta total: $" + ventaTotal);
    }

    static void totalGeneral() {
        int total = 0;
        for (int i = 0; i < vendedores; i++) {
            for (int j = 0; j < zonas; j++) {
                total += ventas[i][j];
            }
        }
        System.out.println("\nEl total de computadoras vendidas por todos los vendedores en todas las zonas es: " + total);
    }

    static void reporte() {
        System.out.println("\nReporte general de ventas");
        System.out.println("Vendedor\tZona1\tZona2\tZona3...\tTotal\tMonto $");

        for (int i = 0; i < vendedores; i++) {
            int totalVendedor = 0;
            System.out.print("V" + (i + 1) + "\t\t");
            for (int j = 0; j < zonas; j++) {
                System.out.print(ventas[i][j] + "\t");
                totalVendedor += ventas[i][j];
            }
            double monto = totalVendedor * precioComputadora;
            System.out.println(totalVendedor + "\t$" + monto);
        }
    }
}