
import java.util.Scanner;

public class Numeromayor {
    public static void main(String[] args) {

        
        Scanner numeros = new Scanner(System.in);

        
        System.out.println("Introduce tres numeros a continuacion: ");
        int numero1 = numeros.nextInt();
        int numero2 = numeros.nextInt();
        int numero3 = numeros.nextInt();

        numeros.close();

       
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el numero mayor es: " + numero1);
        } else {
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("el numero mayor es: " + numero2);
            } else {
                if (numero3 > numero1 && numero3 > numero2) {
                    System.out.println("el numero mayor es: " + numero3);
                    
                } else {
                    System.out.println("Error no se encontro el numero mayor? ");
                }
            }
        }

    }
    
}
