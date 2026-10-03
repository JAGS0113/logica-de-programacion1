import java.util.Scanner;

public class edadPersona {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int añoActual = 2026;
        int añoNacimiento;
        String nombre;
        int edad;


        System.out.println("============DATOS PERSONA========");
        System.out.println("Digite su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Digite el año de su nacimiento:  ");
        añoNacimiento = teclado.nextInt();

        edad = añoActual - añoNacimiento;

        System.out.print("Señor /a: " + nombre);
        System.out.print("\nSu edad es: " + edad );

        teclado.close();
    }
    
}
