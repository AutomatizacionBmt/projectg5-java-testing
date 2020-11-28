package clase2;

public class SumaNumerosPrimos {

    public static void main(String[] args) {
        int n = 100;
        int suma = 0;
        for(int i = 1; i <= n; i ++) {
            if(esPrimo(i)) {
                System.out.println(i);
                suma = suma + i;
            }
        }

        System.out.println("La Suma de los numeros primos menores a 100 es :" + suma);
    }

    public static boolean esPrimo(int numero) {
        // 7 =  7 x 1
        // 11 = 1 X 11
        int contador = 2;
        boolean esPrimo = true;

        while(esPrimo && (contador != numero)) {
            if (numero % contador == 0)
                esPrimo = false;
            contador++;
        }
        return esPrimo;
    }
}
