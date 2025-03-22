import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int numero = input.nextInt();

        if (numero>=0 && numero <=9) {
            System.out.println("el numero tiene 1 cifra");
            
        }
        if (numero >=10 && numero<=99) {
            System.out.println("el numero tiene 2 cifras");
            
       
            
            
        }
        if (numero >=100 && numero<=999) {
            System.out.println("el numero tiene 3 cifras");
           
           
          } if (numero>999) {
            System.out.println("numero no valido");
            
          }
             input.close();
            }

    }
