import java.util.Scanner;

public class AreasFigurasDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char continuar;

        do {
            System.out.println("\nMENÚ DE ÁREAS");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = sc.nextDouble();
                    System.out.println("Área del cuadrado: " + (lado * lado));
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseR = sc.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaR = sc.nextDouble();
                    System.out.println("Área del rectángulo: " + (baseR * alturaR));
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseT = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaT = sc.nextDouble();
                    System.out.println("Área del triángulo: " + ((baseT * alturaT) / 2));
                    break;
                case 4:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = sc.nextDouble();
                    System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (opcion != 5) {
                System.out.print("¿Desea calcular otra área? (s/n): ");
                continuar = sc.next().charAt(0);
            } else {
                continuar = 'n';
            }

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
