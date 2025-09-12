import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un número para generar su tabla:");
            n = sc.nextInt();

            if (n != 0) {
                System.out.println("Tabla de multiplicar del " + n + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
            }
        } while (n != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}

