
import java.util.Scanner;

public class Tablademultiplicar {
    
    public static void main(String[] args) {
        int numero;
        try ( 
                Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
          
        }
        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + "*" + i + "=" + resultado);
        }

    }
}
