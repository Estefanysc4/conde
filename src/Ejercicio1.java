import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("la suma es:  " + (numero1 + numero2));
            System.out.println("la diferencia es: "+(numero1 - numero2));

            
        }else{
            System.out.println("la multiplicacion es:  " + (numero1 * numero2));
            System.out.println("la division es: " +(numero1 / numero2));
    
        }
       input.close();

    }
}