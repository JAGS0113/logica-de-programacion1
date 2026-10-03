public class ventas {

    public static void main(String[] args){

        double[] ventas = {250000, 800000, 1200000, 450000};

        double total = 0;

        int grandes = 0;

        for (double venta : ventas){

            total += venta;

            if (venta >= 500000){
                
                grandes++;
            }
            System.out.println("Total vendido: $" + total);
            System.out.println("Ventas mayores a $500.000: " + grandes);
        }
    }
}

    