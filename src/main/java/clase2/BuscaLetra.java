package clase2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Busque una cadena para determinar si contiene la letra "A".
 */
public class BuscaLetra {

    public static void main(String[] args) {
        System.out.println("Ingrese un texto");
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();// Esto es un texto

        boolean letraEncontrada = false;
        int posicionEncontrada = -1;

        // List<Integer> positions = new ArrayList<>();
        String positions = "";

        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            if (letraActual == 'A' || letraActual == 'a') {
                posicionEncontrada = i;
                //positions.add(posicionEncontrada + 1);
                positions = positions + ", " + (posicionEncontrada + 1);
                letraEncontrada = true;
                //break;
            }
        }

        System.out.println("Posiciones: " + positions);

        if (letraEncontrada) {
            System.out.println("Este texto contiene la letra 'A' en la posicion " + ( posicionEncontrada + 1));
        } else {
            System.out.println("Este texto no contiene la letra 'A'");
        }

    }

}
