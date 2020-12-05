package clase3.datatypes;

import com.sun.xml.internal.stream.XMLEntityStorage;

/**
 * Escriba un método que cuente el número de palabras en una cadena y las imprima individualmente en una nueva línea.
 */
public class ProcessType {

    public static void main(String[] args) {
        String text = "Esto," + "es," + "un," + "texto";
        countWords(text);
        reversedString("quiero una manzana");
        stringBuilder();
        addSpaces("Hola!EstamosAutomatizandoElMundo");
        //Hola! Estamos Automatizando El Mundo
        methodsString();
    }

    private static void countWords(String text) {
        // Esto es un texto -> String[] array = {"Esto", "Es", "un", "texto"}
        String[] textSplit = text.split(",");

        for(String split : textSplit) {
            System.out.println(split);
        }
    }

    private static void reversedString(String text) {
        /*// quiero una manzana
        for(int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();*/
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.reverse());
    }

    private static void stringBuilder() {
        StringBuilder text = new StringBuilder("Esto,");
        text.append("es,").append("un,").append("texto");

        String text2 = text.toString();

        System.out.println(text2);
    }

    /*
    Escriba un método que agregue espacios a Strings mezclados donde todas las palabras se escriben
    juntas sin espacios. Cada nueva palabra comienza con una letra mayúscula,
    EstoEsUnTexto -> Esto Es Un Texto
     */
    private static void addSpaces(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for(int i = 0; i < stringBuilder.length(); i++) {
            if (i != 0 && Character.isUpperCase(stringBuilder.charAt(i))) {
                stringBuilder.insert(i, " ");
                i++;
            }
        }
        System.out.println(stringBuilder);
    }

    private static void methodsString() {
        String name = "Giancarlo";
        if (name.startsWith("Gian")) {
            System.out.println("Yes");
        }

        if (name.endsWith("carlo")) {
            System.out.println("Yes endswith");
        }

        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.substring(2));


        System.out.println("    Hola Mundo   ".trim());
        System.out.println("Giancarlo".replace("r", "k"));
        System.out.println("Hola".concat(" Mundo").concat(" Como estan"));
    }
}
