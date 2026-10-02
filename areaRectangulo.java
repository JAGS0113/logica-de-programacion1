import java.util.Scanner;

public class areaRectangulo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("=========DATOS DEL RECTANGULO=================");
       
        System.out.println("Digite el valor de la Base del Rectangulo");
        base = teclado.nextDouble();
       
        System.out.println("Digite el valor de la Altura del Rectangulo");
        altura = teclado.nextDouble();

        System.out.println("==============================================");

        area = base * altura;

        System.out.println("==========AREA TOTAL RECTANGULO====");
        System.out.println("El area del Rectangulo es: " + area);
        System.out.println("===================================");

        teclado.close();
    }
    
}
