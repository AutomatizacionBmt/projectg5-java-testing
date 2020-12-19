package clase3.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        try {
            System.out.println(numbers[6]);
        } catch (Exception exception) {
            System.out.println("No existe el elemento en la posicion " + exception.getMessage());
        }

        System.out.println(numbers[2]);
    }
}
