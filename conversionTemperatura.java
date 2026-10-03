import java.util.Scanner;

public class conversionTemperatura {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double temperatura;
        double F;

                System.out.print("Digite la temperatura en C° que quieran convertir a Farenheit°:  ");
                temperatura = teclado.nextDouble();

        F = (((temperatura * 9) / 5) + 32);


        System.out.println("=============LAS TEMPERATURAS SON:=======");
        System.out.println("La Temperatura en °C es :" + temperatura);
        System.out.println("La Temperatura en °F es: " + F);
        System.out.println("=========================================");

        teclado.close();
    }
    
}
