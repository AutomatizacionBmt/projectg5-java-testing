package clase3;

import java.util.Arrays;
import java.util.Random;

/**
 * Modificar nuestra clase ticket de loteria, asegurando que nuestro array de enteros no.
 * tenga ningún elemento repetido y este debe estar ordenado al momento que se muestre en pantalla.
 */
public class TicketLoteria2 {

    private static int numeroDeElementos = 6;
    private static int max = 10;

    public static void main(String[] args) {
        int[] tickets = generateTickets();
        //boolean resultSequential = searchSequential(tickets, 4);
        boolean resultBinarySearch = binarySearch(tickets, 4);
        System.out.println("Encontrado: " + resultBinarySearch);
        printTickets(tickets);
    }

    private static int[] generateTickets() {

        int[] tickets = new int[numeroDeElementos];
        Random random = new Random();

        for (int i = 0; i < numeroDeElementos; i++) {
            int aleatorio = random.nextInt(max) + 1 ; // 1 - 69
            tickets[i] = aleatorio;
        }

        return tickets;
    }

    private static boolean searchSequential(int[] array, int numberToSearch) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] array, int numberToSearch) {
        Arrays.sort(array);

        int position = Arrays.binarySearch(array, numberToSearch);

        System.out.println("Position: " + position);

        return position >= 0;
    }

    private static void printTickets(int[] tickets) {
        for (int i = 0; i < tickets.length; i ++) {
            System.out.println("Elemento de la posicion " + i + " : " + tickets[i]);
        }
    }
}
