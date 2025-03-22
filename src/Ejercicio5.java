import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("el numero es positivo");

            
        }
        if (numero < 0) {
            
        
            System.out.println("el nuemro es negativo");
        }
    
        
        if (numero == 0) {
            System.out.println("el numero es nulo");
            
        }
        
        
        input.close();

    }
}
