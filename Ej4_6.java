import java.util.Scanner;

public class Ej4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double AH = 0;  
        int M = 1;      
        double CA;     

        while (M <= 12) {
            System.out.print("Ingrese la cantidad a ahorrar en el mes " + M + ": ");
            CA = sc.nextDouble();

            AH = AH + CA; 
            System.out.println("El ahorro acumulado hasta el mes " + M + " es: " + AH);

            M = M + 1;
        }

        System.out.println("\nEl ahorro final del año es: " + AH);
        sc.close();
}
}

