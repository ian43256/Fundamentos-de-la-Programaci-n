import java.util.Scanner;
public class FabricaArticulosClave{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la clave del producto (1-6): ");
        int clave = sc.nextInt();


        if (clave < 1 || clave > 6) {
            System.out.println("Clave no válida. Intente con un valor entre 1 y 6.");
            sc.close();
            return;
        }

        System.out.print("Ingrese el costo de la materia prima: ");
        double materiaPrima = sc.nextDouble();

        double manoObra = 0, gastoFabricacion = 0;

        switch (clave) {
            case 1 -> {  
                manoObra = materiaPrima * 0.80;
                gastoFabricacion = materiaPrima * 0.28;
            }
            case 2 -> {
                manoObra = materiaPrima * 0.85;
                gastoFabricacion = materiaPrima * 0.30;
            }
            case 3 -> {
                manoObra = materiaPrima * 0.75;
                gastoFabricacion = materiaPrima * 0.35;
            }
            case 4 -> {
                manoObra = materiaPrima * 0.75;
                gastoFabricacion = materiaPrima * 0.28;
            }
            case 5 -> {
                manoObra = materiaPrima * 0.80;
                gastoFabricacion = materiaPrima * 0.30;
            }
            case 6 -> {
                manoObra = materiaPrima * 0.85;
                gastoFabricacion = materiaPrima * 0.35;
            }
        }

        double costoProduccion = materiaPrima + manoObra + gastoFabricacion;
        double precioVenta = costoProduccion * 1.45;

        System.out.println("\nCostos Totales");
        System.out.printf("\nClave del producto: "+ clave);
        System.out.printf("\nMateria prima: "+ materiaPrima);
        System.out.printf("\nMano de obra: "+ manoObra);
        System.out.printf("\nGastos de fabricación: "+ gastoFabricacion);
        System.out.printf("\nCosto de producción: "+ costoProduccion);
        System.out.printf("\nPrecio de venta: "+ precioVenta);

        sc.close();
}
}