import java.util.*;
public class Tienda_Descuentos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //Declaracion Variables
        String Nombre_Producto;
        double precio;
        double descuento;
        double iva = 19;

        //Solicitamos datos al usuario
        System.out.println("Digite el nombre del producto");
        Nombre_Producto = teclado.nextLine();
        System.out.println("Digite el precio del articulo");
        precio = teclado.nextDouble();

        //Determinar descuentos
        if(precio >= 500000){
            descuento = 20;
        } else if(precio >= 300000){
            descuento = 15;
        } else if(precio >= 100000){
            descuento = 10;
        } else {
            descuento = 0;
        }

        //Calculo de valores
        double valor_descuento = precio * descuento / 100;
        double subtotal = precio - valor_descuento;
        double valoriva = subtotal * iva / 100;
        double total  = subtotal + valoriva;

        //Mostrar resultados
        System.out.println("\n==========RESUMEN DE COMPRA=========");
        System.out.println("Nombre del producto:  " + Nombre_Producto);
        System.out.println("Precio del producto:  $" + precio);
        System.out.println("Descuento aplicado:  $" + descuento );
        System.out.println("Valor del descuento: $" + valor_descuento);
        System.out.println("Subtotal:  $" + subtotal);
        System.out.println("IVA (19%):  $" + valoriva);
        System.out.println("Total a pagar:  $" + total);
        System.out.println("=======================================");

      teclado.close();
    }
    
}
