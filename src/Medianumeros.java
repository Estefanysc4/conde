
import java.util.Scanner;

public class Medianumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         
         System.out.println("introduce tres numeros");
         int numero1 = input.nextInt();
         int numero2 = input.nextInt();
         int numero3 = input.nextInt();
 
       
         int suma = numero1 + numero2 + numero3;
         double media = suma / 3;
 
        
         System.out.println("lo numeros que se ingresaron fueron: " + numero1 + "," + numero2 + "," + numero3 + " y la media de los tres numeros es: " + media);
 
         
         input.close();
    }
}
