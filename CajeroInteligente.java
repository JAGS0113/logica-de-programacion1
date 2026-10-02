import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase para representar el Tipo de Cliente
enum TipoCliente {
    REGULAR,
    FRECUENTE,
    VIP
}

// Clase para representar una Venta individual
class Venta {
    private double monto;
    private TipoCliente tipoCliente;

    public Venta(double monto, TipoCliente tipoCliente) {
        this.monto = monto;
        this.tipoCliente = tipoCliente;
    }

    public double getMonto() {
        return monto;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}

// Clase principal del sistema
public class CajeroInteligente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Venta> listaVentas = new ArrayList<>();

        System.out.println("==========================================");
        System.out.println("   SISTEMA DE REGISTRO DE VENTAS DIARIAS  ");
        System.out.println("==========================================");

        boolean continuar = true;

        // Registro de ventas
        while (continuar) {
            double monto = 0;
            while (true) {
                System.out.print("\nIngrese el monto de la venta ($): ");
                if (scanner.hasNextDouble()) {
                    monto = scanner.nextDouble();
                    if (monto > 0) {
                        break;
                    } else {
                        System.out.println("Error: El monto debe ser mayor a 0.");
                    }
                } else {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                    scanner.next(); // Limpiar entrada incorrecta
                }
            }

            // Selección de Tipo de Cliente
            System.out.println("Seleccione el Tipo de Cliente:");
            System.out.println("1. Regular");
            System.out.println("2. Frecuente");
            System.out.println("3. VIP");
            
            TipoCliente tipoCliente = null;
            while (tipoCliente == null) {
                System.out.print("Opción (1-3): ");
                if (scanner.hasNextInt()) {
                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            tipoCliente = TipoCliente.REGULAR;
                            break;
                        case 2:
                            tipoCliente = TipoCliente.FRECUENTE;
                            break;
                        case 3:
                            tipoCliente = TipoCliente.VIP;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.next();
                }
            }

            // Registrar venta
            listaVentas.add(new Venta(monto, tipoCliente));
            System.out.println(">> Venta registrada exitosamente.");

            // Preguntar si se desea registrar otra venta
            System.out.print("\n¿Desea registrar otra venta? (S/N): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        // Procesar y mostrar el informe si hay ventas registradas
        if (listaVentas.isEmpty()) {
            System.out.println("\nNo se registraron ventas en el día.");
        } else {
            generarInforme(listaVentas);
        }

        scanner.close();
    }

    // Método para calcular y mostrar las estadísticas requeridas
    private static void generarInforme(List<Venta> ventas) {
        int totalVentas = ventas.size();
        double dineroRecaudado = 0;
        double ventaMasAlta = Double.MIN_VALUE;
        double ventaMasBaja = Double.MAX_VALUE;

        int ventasSuperiores500k = 0;
        int ventasInferiores100k = 0;

        int clientesRegulares = 0;
        int clientesFrecuentes = 0;
        int clientesVIP = 0;

        for (Venta v : ventas) {
            double monto = v.getMonto();
            dineroRecaudado += monto;

            // Venta más alta y más baja
            if (monto > ventaMasAlta) {
                ventaMasAlta = monto;
            }
            if (monto < ventaMasBaja) {
                ventaMasBaja = monto;
            }

            // Conteos por rangos de monto
            if (monto > 500000) {
                ventasSuperiores500k++;
            }
            if (monto < 100000) {
                ventasInferiores100k++;
            }

            // Conteos por tipo de cliente
            switch (v.getTipoCliente()) {
                case REGULAR:
                    clientesRegulares++;
                    break;
                case FRECUENTE:
                    clientesFrecuentes++;
                    break;
                case VIP:
                    clientesVIP++;
                    break;
            }
        }

        double promedioVentas = dineroRecaudado / totalVentas;

        // Impresión del informe final
        System.out.println("\n==========================================");
        System.out.println("    INFORME DE VENTAS DIARIAS (ADMIN)     ");
        System.out.println("==========================================");
        System.out.printf("• Total de ventas realizadas       : %d\n", totalVentas);
        System.out.printf("• Dinero recaudado                 : $%.2f\n", dineroRecaudado);
        System.out.printf("• Venta más alta                   : $%.2f\n", ventaMasAlta);
        System.out.printf("• Venta más baja                   : $%.2f\n", ventaMasBaja);
        System.out.printf("• Promedio de ventas               : $%.2f\n", promedioVentas);
        System.out.println("------------------------------------------");
        System.out.printf("• Ventas superiores a $500.000     : %d\n", ventasSuperiores500k);
        System.out.printf("• Ventas inferiores a $100.000     : %d\n", ventasInferiores100k);
        System.out.println("------------------------------------------");
        System.out.println("• Ventas realizadas por tipo de cliente:");
        System.out.printf("  - Clientes Regulares             : %d\n", clientesRegulares);
        System.out.printf("  - Clientes Frecuentes            : %d\n", clientesFrecuentes);
        System.out.printf("  - Clientes VIP                   : %d\n", clientesVIP);
        System.out.println("==========================================");
    }
}