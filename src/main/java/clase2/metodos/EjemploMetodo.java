package clase2.metodos;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Escriba un método que le pregunte a un usuario su nombre, luego lo saluda por su nombre.
 */
public class EjemploMetodo {

    int valor;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int suma = 0;
        String nombre = obtenerNombre();
        imprimirSaludo(nombre);
        LocalDate fechaFin = LocalDate.now();
        LocalDate fechaInicio = LocalDate.of(2020, 11, 20);
        System.out.println("La diferencia de dias es: "+ UtilDate.calcularDiferenciaDias(fechaInicio, fechaFin));
    }

    public static String obtenerNombre() {
        solicitarNombre();
        return scanner.nextLine();
    }

    public static void solicitarNombre() {
        System.out.println("Ingrese tu nombre");
    }

    public static void imprimirSaludo(String nombre) {
        System.out.println("Hola, " + nombre + ", bienvenido al curso de automation");
    }

    private void miMetodo() {
        int suma = 0;
        System.out.println(suma);
    }
}
