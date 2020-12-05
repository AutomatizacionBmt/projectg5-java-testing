package clase3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crear un programa que permita al usuario ingresar cualquier número de calificaciones y les
 * proporciona su puntaje promedio, así como los puntajes más altos y más bajos.
 */
public class Calification {

    private static int califications[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuantas calificaciones usted desearia ingresar?");
        califications = new int[scanner.nextInt()];

        getCalifications();

        printCalifications();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));

        System.out.println("Mayor Calification: " + getMayorCalification());
        System.out.println("Minor Calification: " + getMinorCalification());

    }

    private static void getCalifications() {
        for(int i = 0; i < califications.length; i++) {
            System.out.println("Ingrese calificacion # " + (i + 1));
            califications[i] = scanner.nextInt();
        }
    }

    private static void printCalifications() {
        Arrays.stream(califications)
                .forEach(System.out::println);
    }

    private static double calculateAverage() {
        return (double) calculateSum() / califications.length;
    }

    private static int calculateSum() {
        int sum = 0;
        for (int note : califications) {
            sum = sum + note;
        }
        return sum;
    }

    private static int getMayorCalification() {
        int mayor = califications[0];
        for (int calification : califications) {
            if (calification > mayor) {
                mayor = calification;
            }
        }
        return mayor;
    }

    private static int getMinorCalification() {
        int minor = califications[0];
        for (int calification : califications) {
            if (calification < minor) {
                minor = calification;
            }
        }
        return minor;
    }

}
