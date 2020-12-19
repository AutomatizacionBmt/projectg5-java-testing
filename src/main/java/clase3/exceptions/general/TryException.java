package clase3.exceptions.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryException {

    public static void main(String[] args) {
        // createNewFile();
        numbers2();
    }

    public static void createNewFile() {
        File file = new File("resources/noexiste.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("El directorio no existe");
            e.printStackTrace();
        }
    }

    /*
     * Escribir un programa que lea números decimales de un archivo. Y luego manejaremos dos tipos de excepciones que
     * provienen de ese programa: FileNotFoundException y InputMismatchException.
     */
    private static void numbers() {
        File file = new File("numbers.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }

        } catch (FileNotFoundException | InputMismatchException exception) {
            System.out.println("Entraste al catch");
            exception.printStackTrace();
        } finally {
            System.out.println("Entraste al finally");
            fileReader.close();
        }
    }

    private static void numbers2() {
        File file = new File("numbers.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while(fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException exception) {
            System.out.println("Entraste al catch");
            exception.printStackTrace();
        }
    }
}
