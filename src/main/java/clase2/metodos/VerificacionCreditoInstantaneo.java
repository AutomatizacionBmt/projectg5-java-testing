package clase2.metodos;

import java.util.Scanner;

/**
 * Escriba un programa de "verificación de crédito instantánea" que apruebe cualquier persona que gane más de S/ 25,000 y
 * tenga un score de crédito de 700 o mejor. Rechaza a todos los demás.
 */
public class VerificacionCreditoInstantaneo {

    static double salarioRequerido = 25000;
    static int scoreCrediticioRequerido = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salario = obtenerSalario();
        int score = obtenerScoreCrediticio();

        boolean estaCalificado = esUsuarioCalificado(salario, score);

        System.out.println("Esta calificado? " + estaCalificado);

        notificaUsuario(estaCalificado);

    }

    public static double obtenerSalario() {
        System.out.println("Ingrese su salario: ");
        return scanner.nextDouble();
    }

    public static int obtenerScoreCrediticio() {
        System.out.println("Ingrese su score crediticio: ");
        return scanner.nextInt();
    }

    public static boolean esUsuarioCalificado(double salario2, int score2) {
        /* if(salario >= salarioRequerido && score >= scoreCrediticioRequerido) {
            return true;
        } else {
            return false;
        }*/
        return salario2 >= salarioRequerido && score2 >= scoreCrediticioRequerido;
    }

    public static void notificaUsuario(boolean estaCalificado) {
        System.out.println(estaCalificado
                ? "Felicidades!, has aprobado el credito"
                : "Lo Sentimos!, para otra oportunidad");
    }
}
