package clase1;

import java.util.Scanner;

public class Estaciones {

    public static void main(String[] args) {

        //I.- Estaciones: 1.-Primavera ; 2.-Verano ; 3.-Otoño ; 4.-Invierno
        //Leer por pantalla la estación
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la estación del año:");

        //Variable estacion
        String estacion = scanner.next();

        //II.- Ingresar el número entero asociado a la estación
        System.out.println("Ingresar el número entero asociado a la estación:");

        //Variable numeroEstacion
        int numeroEstacion = scanner.nextInt();

        //III.- Ingresar una actividad que se realiza en esa estación
        System.out.println("Ingresar la actividad que realiza en esta estación: ");

        //Variable actividad
        String actividad = scanner.next();

        //IV.- Mostrar por pantalla lo que se ingreso anteriormente
        //Ejemplo
        //1.- Verano
        //2.- 2
        //3.- Voy a la Playa
        //Yo en 'Verano' que es la estación '2' 'voy a la playa'

        System.out.println("Yo en "+estacion+" que es la estación número "+numeroEstacion+
                " voy a la "+actividad);

        scanner.close();

    }
}
