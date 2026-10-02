import java.util.Scanner;

public class Cajero_Inteligente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double Total_Ventas = 0;
        // Reto 2: Contador ajustado a compras mayores a 30.000
        int comprasMayores30k = 0; 
        // Reto 3: Contador para compras menores o iguales a 20.000
        int comprasMenoresOIgual20k = 0; 
        double Promedio_Compras;

        // 1. Pedir la cantidad de compras
        System.out.println("Digite la cantidad de Compras que deseas registrar:");
        int tamano = teclado.nextInt();

        // 2. Declaración e inicialización del arreglo
        int[] compras = new int[tamano];

        // 3. Bucle para registrar y evaluar cada compra
        for (int i = 0; i < compras.length; i++) {
            System.out.println("Digite el valor de la compra [" + (i + 1) + "]: ");
            compras[i] = teclado.nextInt();
            
            // Sumatoria para el total de ventas
            Total_Ventas += compras[i];

            // Reto 2: Evaluación de compras mayores a 30.000
            if (compras[i] > 30000) {
                comprasMayores30k++;
            }

            // Reto 3: Evaluación de compras menores o iguales a 20.000
            if (compras[i] <= 20000) {
                comprasMenoresOIgual20k++;
            }
        }

        // 4. Mostrar resultados
        if (compras.length > 0) {
            Promedio_Compras = Total_Ventas / compras.length;
            System.out.println("----------------------------------------");
            System.out.println("El total de ventas es: " + Total_Ventas);
            System.out.println("El promedio de compras es: " + Promedio_Compras);
            System.out.println("Cantidad de compras mayores a 30.000: " + comprasMayores30k);
            System.out.println("Cantidad de compras menores o iguales a 20.000: " + comprasMenoresOIgual20k);
            
            // Reto 4: Evaluación del promedio para determinar el tipo de día
            if (Promedio_Compras > 25000) {
                System.out.println("Estado de la jornada: Día excelente");
            } else {
                System.out.println("Estado de la jornada: Día normal");
            }
        }
       
        teclado.close();
    }
}