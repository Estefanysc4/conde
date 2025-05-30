public class Contadornúmerospares {
    public static void main(String[] args) {
        
        int contador = 0;

      
        for (int inicio = 1; inicio <= 100; inicio++) {
            if (inicio % 2 == 0) {
                System.out.println(" numero par: " + inicio);
                contador ++;
            }
        }

        System.out.println("Los cantidad numeros primos entre 1 y 100 son: " + contador);
    }
    
}
