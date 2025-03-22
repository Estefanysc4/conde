import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el sueldo");
        int sueldo = input.nextInt();

        if (sueldo > 3000) {
            System.out.println("debe abonar impuesto");
            
        }
        input.close();
    }
}