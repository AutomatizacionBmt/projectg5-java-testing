package clase3.exceptions;

public class UncheckedException {
    public static void main(String[] args) {
        Math math = new Math();
        double result = math.divideUnChecked(5, 2);
        System.out.println("El resultado es: " + result);
    }
}
