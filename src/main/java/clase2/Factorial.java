package clase2;

import java.util.Scanner;

/**
 * 3! = 3 * 2 * 1 = 4
 * 4! = 4 * 3 * 2 * 1 = 24
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 * 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
 */
public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero a calcular factorial");

        int numero = scanner.nextInt();

        int factorial = 1;
        int inicializacion = 1;
        while (inicializacion <= numero) {
            factorial = factorial * inicializacion;
            inicializacion++;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
