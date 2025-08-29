import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
            
        System.out.print("Ingrese la operación a realizar (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        int resultado;
        double resultadoDiv;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultadoDiv = (double) num1 / num2;
                    System.out.println("Resultado de la división: " + resultadoDiv);
                } else {
                    System.out.println("Error: división por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        sc.close();
}
}