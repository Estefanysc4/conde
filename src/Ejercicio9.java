import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la primer nota");
        float nota1 = input.nextFloat();
        System.out.println("ingrese la segunda nota");
        float nota2 = input.nextFloat();
        System.out.println("ingrese la tercer nota");
        float nota3 = input.nextFloat();
        float promedio = (nota1+nota2+nota3)/3;

        if (promedio > 7) {
            System.out.println("promocionado");
            
        }
        if (promedio >=4 && promedio <= 7) {
            System.out.println("regular");
        }
        if (promedio < 4) {
            System.out.println("reprobado");
            
        
            
        }
        
        
            
        
        input.close();

    }
}
