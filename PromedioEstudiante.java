import java.util.Scanner;

public class PromedioEstudiante {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        final double NOTA_MINIMA = 3.0;

        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.println("===============================");
        System.out.println("SISTEMA DE EVALUACION ACADEMICA");
        System.out.println("===============================");

        System.out.print("Ingrese la primera nota : ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la segunda nota : ");
        nota2 = teclado.nextDouble();

        System.out.print("Ingrese la tercera nota : " );
        nota3 = teclado.nextDouble();
        
        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nPromedio obtenido: " + promedio );

        if (promedio >= NOTA_MINIMA) {

            System.out.println("Felicitaciones, el estudiante APROBO la asignatura");

        } else{
            System.out.println("El estudiante REPROBO la asignatura");
        }

        teclado.close();


    }
}