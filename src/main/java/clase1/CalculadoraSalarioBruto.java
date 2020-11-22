package clase1;

import java.util.Scanner;

public class CalculadoraSalarioBruto {


    public static void main(String[] args){

        //1. El primer paso es que obtendríamos la cantidad de horas trabajadas.
        System.out.println("Ingresar el número de horas que el empleado ha trabajado");
        Scanner scanner = new Scanner(System.in);
        int horas =  scanner.nextInt();

        //2. Luego, obtenemos la tarifa de pago por hora.
        System.out.println("Ingrese la tarifa de pago por hora.");
        double tarifa = scanner.nextDouble();

        scanner.close();

        /*3. Luego, multiplicamos las horas y la tarifa de pago. */
        double salarioBruto = horas * tarifa;

        //4. Finalmente, mostraríamos el resultado.
        System.out.println("El salario bruto del empleado es: " + salarioBruto);

    }


}
