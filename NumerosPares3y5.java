import java.util.Scanner;
public class NumerosPares3y5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAMA MULTIPLO DE 3 o 5");
        System.out.println("Ingresa un numero: "); 
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Falso");
        }else if(num%3==0 || num%5==0){
            System.out.println("Verdadero");
        }else{
            System.out.println("El numero no es multiplo de 5 ni de 3");
}
}
}