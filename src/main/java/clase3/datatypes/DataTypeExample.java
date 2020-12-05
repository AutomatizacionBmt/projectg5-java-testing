package clase3.datatypes;

public class DataTypeExample {

    public static void main(String[] args) {
        byte b = -128;
        System.out.println("b = " + b);
        System.out.println("Value Min: "+ Byte.MIN_VALUE);
        System.out.println("Value Max: "+ Byte.MAX_VALUE);

        short miShort = 32767;
        System.out.println("miShort = " + miShort);
        System.out.println("Value Min: "+ Short.MIN_VALUE);
        System.out.println("Value Max: "+ Short.MAX_VALUE);

        int miInt = 2147483647;
        System.out.println("miInt = " + miInt);
        System.out.println("Valor Minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor Maximo: " + Integer.MAX_VALUE);

        long miLong = 9223372036854775807L;
        System.out.println("miLong = " + miLong);
        System.out.println("Valor Minimo: " + Long.MIN_VALUE);
        System.out.println("Valor Maximo: " + Long.MAX_VALUE);

        float miFloat = 32767.54f;
        System.out.println("miLong = " + miFloat);
        System.out.println("Valor Minimo: " + Float.MIN_VALUE);
        System.out.println("Valor Maximo: " + Float.MAX_VALUE);

        double miDouble = 32767.54;
        System.out.println("miDouble = " + miDouble);
        System.out.println("Valor Minimo: " + Double.MIN_VALUE);
        System.out.println("Valor Maximo: " + Double.MAX_VALUE);

        boolean miBoolean = true;
        System.out.println("miBoolean = " + miBoolean);

        char miChar = '\u0021';// 33, '!',
        System.out.println("miChar = " + miChar);

    }
}
