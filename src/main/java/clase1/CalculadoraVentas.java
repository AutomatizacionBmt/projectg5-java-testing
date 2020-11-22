package clase1;

import java.util.Scanner;

public class CalculadoraVentas {

    /**
     * Se espera que todos los vendedores realicen al menos 10 ventas por semana,
     * para aquellos que lo hacen, reciben un mensaje de felicitación.
     * Para aquellos que no lo hacen, se les informará cuantás ventas les faltaron
     */

    public static void main(String[] args) {

        //Inicializar valores conocidos
        int ventas = 10;

        //Obtener valores
        System.out.println("Ingresar el nro de ventas que realizó esta semana");
        Scanner scanner = new Scanner(System.in);
        int ventasVendedor = scanner.nextInt();

        scanner.close();

        //Realizar la comparación
        if (ventasVendedor >= ventas) {
            System.out.println("!Felicitaciones! Usted llegó a la meta de ventas");
        } else {

            int ventasFaltaron = ventas - ventasVendedor;
            System.out.println("Lo sentimos no llegó a la meta de ventas. Le faltaron " + ventasFaltaron + " ventas");

        }
    }
}
