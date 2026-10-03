import java.util.Scanner;

public class CompraMercado {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);

        String nombreProducto;
        double precioProducto;
        int cantidad;
        double total;

        System.out.println("Escriba el nombre del producto: ");
        nombreProducto = teclado.nextLine();
        System.out.println("Escriba el precio del producto: $");
        precioProducto = teclado.nextDouble();
        System.out.println("Digite laa cantidad de producto : ");
        cantidad = teclado.nextInt();

        total = precioProducto * cantidad;

        System.out.println("===============FACTURA===============================");
        System.out.println("El producto de su conpra fue: " + nombreProducto);
        System.out.println("La cantidad de producto de la compra fue: " + cantidad);
        System.out.println("El valor total de la compra fue: $" + total);
        System.out.println("=====================================================");

        teclado.close();
        

        
    }
    
}
