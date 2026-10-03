import java.util.Scanner;

public class tiendaTecnologica {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double  Valor_Compra;
        double  Valor_Descontado;
        double	Total_Pagar;

        System.out.println("Digite el valor de la compra");
        double Valor_Compra = teclado.nextDouble();

        if(Valor_Compra >= 300.000){
            System.out.println("El valor de la compra fue:" + Valor_Compra);
            System.out.println("Su descuento es del 20%");
            Valor_Descontado = Valor_Compra * 0.2;
	        Total_Pagar = Valor_Compra - Valor_Descontado;
        } else if (Valor_compra = 200.000 && Valor_Compra < = 299.999){
            System.out.println("El valor de su compra fue: " + Valor_Compra);
            Valor_Descontado = Valor_Compra * 0.15;
		    Total_Pagar = Valor_Compra - Valor_Descontado;
        } else if (Valor_Compra = 100.000 && Valor_Compra < = 199.999){
            System.out.println("El valor de su compra fue:" + Valor_Compra);
            Valor_Descontado = Valor_Compra * 0.10;
		    Total_Pagar = Valor_Compra - Valor_Descontado;
            
        } else System.out.println("Sin descuento");

        }


    }


    

