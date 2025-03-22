import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la primer nota");
        float nota1 = input.nextInt();
        System.out.println("ingrese la segunda nota");
        float nota2 = input.nextInt();
        System.out.println("ingrese la tercer nota");
        float nota3 = input.nextInt();
        float media = (nota1+nota2+nota3)/3;
        System.out.println("el promedio es:  "+ media);
        if (media >= 7) {
            System.out.println("promocionado");
            
        }

        input.close();


         
            
        

    }
}
