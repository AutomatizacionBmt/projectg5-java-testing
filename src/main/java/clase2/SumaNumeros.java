package clase2;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Escriba un programa que permita a un usuario ingresar dos números,
 * y luego sume los dos números. El usuario debería poder repetir esta acción hasta
 * que indiquen que han terminado.
 */
public class SumaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar;

        do {
            System.out.println("Ingrese numero 1: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese numero 2: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("La suma es: " + sum);

            System.out.println("¿Desea continuar sumando? ingrese true or false");
            continuar = scanner.nextBoolean();
        } while (continuar);
    }
}
