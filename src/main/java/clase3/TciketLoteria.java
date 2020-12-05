package clase3;

import java.util.Random;

/**
 * Crear una aplicación que genere un ticket de lotería  con 6 números aleatorios entre 1 – 69.
 * 1 | 2 | 56 | 5 | 23 | 12 |
 */
public class TciketLoteria {

    private static int numeroDeElementos = 6;
    private static int max = 69;

    public static void main(String[] args) {
        int[] numeros = new int[4];// 0,1,2,3
        int numeros2[] = new int[3];

        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 5;
        numeros[3] = 6;

        System.out.println("Numero de elementos: " + numeros.length);

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int  numeros3[] = { 3,4,5,6, 7, 8, 9, 10};// 8 elementos


        System.out.println("Otra forma");
        for(int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        System.out.println("Tercer elemento: " + numeros3[7]);

        System.out.println("**************** Tickets 1 ******************");
        int[] tickets = generateTickets();
        printTickets(tickets);

        System.out.println("**************** Tickets 2 ******************");
        int[] tickets2 = generateTickets();
        printTickets(tickets2);

        String name = getName();
    }

    private static int[] generateTickets() {

        int[] tickets = new int[numeroDeElementos];
        Random random = new Random();

        for (int i = 0; i < numeroDeElementos; i++) {
            int aleatorio = random.nextInt(69) + 1 ; // 1 - 69
            tickets[i] = aleatorio;
        }

        return tickets;
    }

    private static void printTickets(int[] tickets) {
        for (int i = 0; i < tickets.length; i ++) {
            System.out.println("Elemento de la posicion " + i + " : " + tickets[i]);
        }
    }

    private static String getName() {
        return "Giancarlo";
    }
}
