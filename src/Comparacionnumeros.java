
import java.util.Scanner;

public class Comparacionnumeros {
    public static void main(String[] args) {

        
        Scanner numeros = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = numeros.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = numeros.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int numero3 = numeros.nextInt();

        
        numeros.close();

       
        Boolean resultado = numero1 > numero2 && numero1 < numero3 ;

        
        if (numero1>numero2) {
            if (numero1<numero3) {
             System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado );
            }
            else {
                System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado ); 
            }
        } else {
            System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado );
        }
    }
}
