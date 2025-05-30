public class Valoresmagico {
   
    public static void main(String[] args) {
                double precioBase = 100;
                double descuento = precioBase * 0.15;
                double iva = precioBase * 0.19; 
                double precioFinal = precioBase - descuento + iva;
                System.out.println("El precio final es: " + precioFinal);
       }
  } 




