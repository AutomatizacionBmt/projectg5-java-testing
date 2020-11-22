package clase1;

import java.util.Scanner;

public class CalcularSalarioConBono {

    /**
     * Todos los vendedores reciben un pago de S/1000 por semana,
     * Los vendedores que superen las 10 ventas obtienen un bono
     * adicional de S/250.
     * Mostrar por pantalla el salario final
     */


    public static void main(String[] args) {

        //Inicializar los valores conocidos
        int salario = 1000;
        int bonus = 250;
        int ventas = 10;

        //Obtener los valores
        System.out.println("¿Cuántas ventas hizo el empleado esta semana?");
        Scanner scanner = new Scanner(System.in);
        int ventasEmpleado = scanner.nextInt();
        scanner.close();

        //Comparar quienes superan las ventas
        if (ventasEmpleado > ventas) {
            salario = salario + bonus;
        }

        //Resultado
        System.out.println("El pago del empleado es S/" + salario);
    }

}
