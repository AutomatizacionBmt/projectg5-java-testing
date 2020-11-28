package ejercicios;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/*
¡El objetivo del juego es ingresar suficiente cambio para calificar exactamente S/ 1! Crear un programa que le pida al
usuario que ingrese las cantidades de las siguientes monedas: 1 céntimo, 5 céntimos, monedas de 10 céntimos y 25 céntimos.
Su programa debe contar el valor de todos los cambios. Si es exactamente S/ 1 ¡ganan! , Si es más de S/ 1 dígales cuánto se
han excedido. Si es menos de S/ 1 dígales cuánto les falta.
 */
public class CambioJuegoPorUnSol {

    public static void main(String[] args) {
        //Variable
        // TipoDeDato nombreVariable
        double unCentimo = 0.01;
        double cincoCentimos = 0.05;
        double diezCentimos = 0.10;
        double ventiCincoCentimos = 0.25;

        int sol = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********** Bienvenido a Cambio por un sol ***********");

        System.out.println("Ingrese sus monedas de un centimo");
        int monedasUnCentimo = scanner.nextInt();

        System.out.println("Ingrese sus monedas de cinco centimos");
        int monedasCincoCentimos = scanner.nextInt();

        System.out.println("Ingrese sus monedas de diez centimos");
        int monedasDiezCentimos = scanner.nextInt();

        System.out.println("Ingrese sus monedas de veinticinco centimos");
        int monedasVeintiCincoCentimos = scanner.nextInt();

        double total = monedasUnCentimo * unCentimo + monedasCincoCentimos * cincoCentimos + monedasDiezCentimos * diezCentimos
                + monedasVeintiCincoCentimos * ventiCincoCentimos;

        if (total < sol) {
            double montoCorto = sol - total;
            System.out.println("Lo Siento, perdiste, te falta, " + montoCorto);
        } else if(total > sol) {
            double montoExcedido = total - sol;
            System.out.println("Lo Siento, perdiste, te excediste, " + montoExcedido);
        } else {
            System.out.println("Muy Bien, Es exactament 1 sol, Has ganado");
        }
    }

}
