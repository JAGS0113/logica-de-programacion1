import java.util.Scanner;
 
public class EdadesAnimales {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int totalAnimales = 3;
        int sumaEdades = 0;

        System.out.println("--- Calculadora de Edad Promedio de Animales ---");

        for (int i = 1; i <= totalAnimales; i++) {
            System.out.print("Introduce la edad del animal " + i + ": ");
            int edad = scanner.nextInt();

            sumaEdades += edad; 
        }

        double promedio = (double) sumaEdades / totalAnimales;

        System.out.println("\n---------------------------------------------");
        System.out.println("La edad promedio de los " + totalAnimales + " animales es: " + promedio + " años.");
        
        scanner.close();
    }
}
