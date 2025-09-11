import java.util.Scanner;

public class CalculadoraBasicaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char operacion;
        char continuar;

        do {
         
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextInt();

          
            System.out.print("Ingrese la operación (+, -, *, /): ");
            operacion = sc.next().charAt(0);

            switch (operacion) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
            }

        
            System.out.print("¿Desea hacer otra operación? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
