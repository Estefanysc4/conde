import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer nuemro ");
        int numero1 = input.nextInt();
        System.out.println("ingrese el segundo nuemro ");
        int numero2 = input.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("el numero mayor es: " + numero1) ;

            
        } else{
            System.out.println("el numero mayor es " + numero2);
        }
        input.close();
    }
}
