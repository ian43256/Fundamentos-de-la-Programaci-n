import java.util.Scanner;
public class Eje4_7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int C,CA,CP,CN;
        int NU;
        CP=0;
        CN=0;

        System.out.print("Ingrese el numero de cantidades: ");
        NU=sc.nextInt();
        C=1;

        do{
            System.out.print("Ingrese la cantidad" + C +": ");
            CA=sc.nextInt();

            if(CA>0){
                CP=CP+1;
            }
            else {
            CN=CN+1;
            } 
            C = C + 1; 
            } while(C<=NU);
            System.out.println("Positivos: "+ CP);
            System.out.println("Negativos o ceros: "+ CN);

            sc.close();
        }
    }
