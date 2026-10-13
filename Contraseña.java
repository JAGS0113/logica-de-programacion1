import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {

        String contraseñaCorrecta = "JAVA2026";
        String passwordIngresada = "";

        Scanner scanner = new Scanner(System.in);

        while (!passwordIngresada.equals(contraseñaCorrecta)) {
            System.out.print("Introduce la contraseña: ");
            passwordIngresada = scanner.nextLine(); 

            if (!passwordIngresada.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.\n");
            }
        }

        System.out.println("¡Acceso concedido! Bienvenido al sistema.");
        
        scanner.close();
        
    }
}
