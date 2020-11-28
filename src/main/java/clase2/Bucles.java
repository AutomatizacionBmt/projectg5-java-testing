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

        System.out.println("************ FOR ************");
        for(int i = 1; i <= 5 ; i++) {
            System.out.println(i);
        }

        System.out.println("************ FOR EACH ************");

        String[] nombres2 = {"Giancarlo", "Elvis", "Ashley"};
        // for (TipoDeDato nombreVariable : coleccion)
        /*for(int i = 0; i < nombres2.length; i++) {
            System.out.println(nombres2[i]);
        }*/

        for(String nombre : nombres2) {
            System.out.println(nombre);
        }

    }
}
