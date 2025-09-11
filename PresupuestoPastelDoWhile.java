import java.util.Scanner;

public class PresupuestoPastelDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            double precioTotal = 0;
            String sabor, chocolate, respuesta;

            do {
                System.out.print("Seleccione el sabor del pastel (manzana, fresa, chocolate): ");
                sabor = sc.nextLine().toLowerCase();
                if (!sabor.equals("manzana") && !sabor.equals("fresa") && !sabor.equals("chocolate")) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (!sabor.equals("manzana") && !sabor.equals("fresa") && !sabor.equals("chocolate"));

            switch (sabor) {
                case "manzana":
                    precioTotal = 200;
                    break;
                case "fresa":
                    precioTotal = 250;
                    break;
                case "chocolate":
                    do {
                        System.out.print("Seleccione el tipo de chocolate (negro/blanco): ");
                        chocolate = sc.nextLine().toLowerCase();
                        if (!chocolate.equals("negro") && !chocolate.equals("blanco")) {
                            System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    } while (!chocolate.equals("negro") && !chocolate.equals("blanco"));

                    if (chocolate.equals("negro")) {
                        precioTotal = 280;
                    } else {
                        precioTotal = 300;
                    }
                    break;
            }

            System.out.print("¿Desea añadir snack? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")) {
                System.out.print("Ingrese el tipo de snack: ");
                sc.nextLine(); 
                sc.nextLine();
                precioTotal += 25;
            }

            System.out.print("¿Desea personalizar el pastel con un nombre? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("si")) {
                precioTotal += 30;
            }

            System.out.println("El precio total del pastel es: $" + precioTotal);

            System.out.print("¿Desea realizar otro presupuesto? (s/n): ");
            continuar = sc.nextLine().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
