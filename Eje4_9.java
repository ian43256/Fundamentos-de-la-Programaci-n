import java.util.Scanner;

public class Eje4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de digito de la sucesión de Fibonacci: ");
        int N = sc.nextInt();

        int A = 0, B = 1, C, M;

        if (N >= 1) {
            System.out.print(A + " ");
        }
        if (N >= 2) {
            System.out.print(B + " ");
        }

        M = 3;
        while (M <= N) {
            C = A + B;
            System.out.print(C + " ");
            A = B;
            B = C;
            M++;
 }
}
}