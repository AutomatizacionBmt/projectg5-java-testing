package clase3.exceptions;

public class CheckedException {

    public static void main(String[] args) throws Exception {
        Math math = new Math();
        // firstForm(math);
        secondForm(math);
    }

    private static void firstForm(Math math) {
        try {
            double result = math.divide(5, 0);
            System.out.println("El resultado es: " + result);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void secondForm(Math math) throws Exception {
        double result = math.divide(5, 0);
        System.out.println("El resultado es: " + result);
    }

}
