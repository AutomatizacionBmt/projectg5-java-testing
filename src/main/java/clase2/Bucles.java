package clase2;

public class Bucles {

    public static void main(String[] args) {
        //Inicializacion
        //COndicion
        //Bloque de sentencias
        //Actualizacion

        System.out.println("************ WHILE ************");
        int n = 11;// Inicializacion
        while (n <= 5) { // Condicion
            System.out.println(n);//Bloque de sentencia
            n = n + 1;
        }

        System.out.println("************ DO WHILE ************");

        int a = 11;
        do {
            System.out.println(a);
            a++; // a = a + 1
        } while(a <= 5);


    }
}
