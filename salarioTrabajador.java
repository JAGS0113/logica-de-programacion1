import java.util.Scanner;

public class salarioTrabajador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreTrabajador;
        double horastrabajadas;
        double valorhora;
        double salario;

        System.out.println("======CALCULO SALARIO TRABAJADOR=======");
        System.out.print("Digite el nombre del trabajador: ");
        nombreTrabajador = teclado.nextLine();
        System.out.print("Digite el valor de una hora de trabajo:  $");
        valorhora = teclado.nextDouble();
        System.out.print("Digite el total de horas trabajadas   ");
        horastrabajadas = teclado.nextDouble();

        salario = horastrabajadas * valorhora;

       
        System.out.println("===========SALARIO DEVENGADO===========");
        System.out.println("Señor/a: " + nombreTrabajador);
        System.out.println("Usted ha trabajado: " + horastrabajadas);
        System.out.println("Su salario es: $" + salario);
        System.out.println("=======================================");

        teclado.close();

        
    }
    
}
