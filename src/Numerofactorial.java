
import java.util.Scanner;

public class Numerofactorial {
    public static void main(String[] args) {
        int number;
       
        try ( 
                Scanner numero = new Scanner(System.in)) {
            
            System.out.println("ingrese el numero:");
            number = numero.nextInt();
           
        }
        int factorial = 1;
        int i = 1;

        while ( i <= number) {
          factorial *= i;
          i++;

        }
      
        System.out.println("EL factorial de " + number + " es: " + factorial);
    }
}
