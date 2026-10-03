import java.util.Scanner;

public class cuentaRestaurante {

    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);

        String nombreCliente;
        String nombrePlato;
        String nombreBebida;
        double precioPlato;
        double precioBebida;
        double subtotal;
        double total;
        double iva ; 

        System.out.println("\n===========SISTEMA DE RESTAURANTE=========");
        System.out.println("Digite el nombre del cliente: ");
        nombreCliente = teclado.nextLine();
        System.out.println("Digite el nombre del Plato Principal: ");
        nombrePlato = teclado.nextLine();
        System.out.println("Digite el Nombre de la bebida del pedido: ");
        nombreBebida = teclado.nextLine();
        System.out.println("Digite el Precio del Plato Principal: ");
        precioPlato = teclado.nextDouble();
        System.out.println("Digite el precio de la bebida del pedido: ");
        precioBebida = teclado.nextDouble();

        subtotal = precioPlato + precioBebida;
        
        iva = (subtotal * 19) / 100;

        total = subtotal + iva;

        System.out.println("=============FACTURA====================");
        System.out.println("El nombre del cliente es: " + nombreCliente);
        System.out.println("El Plato del pedido fue: " + nombrePlato);
        System.out.println("La Bebida del pedido fue: " + nombreBebida);
        System.out.println("El Subtotal de la cuenta fue:  $" + subtotal);
        System.out.println("El valor del IVA es: $" + iva);
        System.out.println("El Coste total del Almuerzo fue: $" + total);
        System.out.println("==========================================");

        teclado.close();


    }
    
}
