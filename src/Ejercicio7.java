import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad de preguntas ");
        int totalpreguntas = input.nextInt();
        System.out.println("ingrese cantidad de respuestas correctas");
        int correctas = input.nextInt();
        double porcentaje = (double)(totalpreguntas*correctas)/100;
        System.out.println("el porcentaje es:  "+ porcentaje + "%");

        if (porcentaje>=90) {
            System.out.println("nivel maximo");
            
        }
        if (porcentaje>=75 && porcentaje <90) {
            System.out.println("nivel medio");
            
        }
        if (porcentaje>=50 && porcentaje<75) {
            System.out.println("nivel regular");
            
        }
        if (porcentaje<50) {
            System.out.println("fuera de nivel");
            
        }
        input.close();
    }
}
