import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de líneas (n): ");
        int n = sc.nextInt();

        int i, j, k, l;

        for (i = 0; i < n; i++) {
            for (l = 0; l < 5; l++) {  
                System.out.print("* ");
            }
            System.out.println(); 
        }

        System.out.println();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
