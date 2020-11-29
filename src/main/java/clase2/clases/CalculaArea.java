package clase2.clases;

import java.util.Random;
import java.util.Scanner;

/**
 * Escribamos una clase “CalcularArea” que calcule el area de dos habitaciones y muestre en
 * pantalla el area total de las habitaciones.
 */
public class CalculaArea {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*CalculaArea calculaArea = new CalculaArea();

        Rectangulo cocina = calculaArea.getRectangulo("cocina");
        Rectangulo banio = calculaArea.getRectangulo("banio");

        System.out.println("El area total es: " + calculaArea.calcularAreaTotal(cocina, banio));
        System.out.println("El Perimetro total es: " + calculaArea.calcularPerimetroTotal(cocina, banio));*/

        getMes("String");
        getMes(30);
        getMes(30, "String");
        getMes("String", 30);

        Random random = new Random();
        for(int i = 0; i <= 5; i++) {
            int aleatorio = random.nextInt(6) + 1;
            System.out.println(aleatorio);
        }

    }

    public Rectangulo getRectangulo(String descripcion) {
        System.out.println("Ingrese el largo de " + descripcion);
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el ancho de " + descripcion);
        double ancho = scanner.nextDouble();

        return new Rectangulo(largo, ancho);
    }

    public double calcularAreaTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularArea() + banio.calcularArea();
    }

    public double calcularPerimetroTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularPerimetro() + banio.calcularPerimetro();
    }

    public static void getMes(String nombre) {
        System.out.println("String: " + nombre);
    }

    public static void getMes(Integer nombre) {
        System.out.println("Integer: " + nombre);
    }

    public static void getMes(String atributo1, Integer atributo2) {
        System.out.println("String, Integer: " + atributo1 + " - " + atributo2);
    }

    public static void getMes( Integer atributo2, String atributo1) {
        System.out.println("Integer, String: " + atributo1 + " - " + atributo2);
    }


}
