package clase1;

import java.util.Scanner;

public class CalificadorPrestamo {

    /**
     * Calificador de Préstamo
     * Para calificar para un préstamo, una persona debe ganar al menos S/3,000
     * y haber trabajado en su trabajo actual durante al menos 2 años.
     */

    public static void main(String[] args) {

        //Inicializar los valores conocidos
        int salarioRequerido = 3000;
        int aniosRequeridos = 2;

        //Obtener los valores de la persona a calificar
        //Ingresar el salario
        System.out.println("Ingresar su salario");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        //Ingresar los años que esta trabajando
        System.out.println("Ingresar el numero de años con su empleador actual");
        double anios = scanner.nextDouble();

        scanner.close();

        //Realizar la calificación (Califica o no Califica)
        if (salario >= salarioRequerido) {
            if (anios >= aniosRequeridos) {
                System.out.println("!Felicitaciones! Usted ha calificado para el préstamo.");
            } else {
                System.out.println("Lo sentimos, Usted no ha calificado al préstamo. Porque " +
                        " no tiene lo " + aniosRequeridos + " años requeridos.");
            }
        } else {
            System.out.println("Lo sentimos, Usted no ha calificado al préstamo. Debe ganar al menos S/"
                    + salarioRequerido + " para calificar.");
        }
    }


}
