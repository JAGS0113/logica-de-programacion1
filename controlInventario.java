import java.util.Scanner;

public class controlInventario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] productos = {
                "Portatil Lenovo",
                "iPhone 15",
                "Mouse Logitech",
                "Teclado Redragon",
                "Parlante JBL"
        };

        int[] stock = {8, 12, 25, 10, 4};

        System.out.println("======================================");
        System.out.println("       URBANMARKET - INVENTARIO       ");
        System.out.println("======================================");

        for (int i = 0; i < productos.length; i++) {

            System.out.println("\nProducto: " + productos[i]);
            System.out.println("Existencias disponibles: " + stock[i]);

            System.out.print("¿Cuántas unidades desea comprar? ");
            int cantidadSolicitada = entrada.nextInt();
 
            if (cantidadSolicitada <= 0) {

                System.out.println("La cantidad debe ser mayor que cero.");

            } else if (cantidadSolicitada <= stock[i]) {

                int unidadesRestantes = stock[i] - cantidadSolicitada;

                System.out.println("Pedido disponible.");
                System.out.println("Unidades solicitadas: "+ cantidadSolicitada);
                System.out.println("Unidades restantes: " + unidadesRestantes);

            } else {

                System.out.println("No hay suficiente inventario.");
                System.out.println("Disponible actualmente: "+ stock[i]);
            }
        }

        System.out.println("\n======================================");
        System.out.println("       PROCESO FINALIZADO             ");
        System.out.println("======================================");

        entrada.close();
    }
}