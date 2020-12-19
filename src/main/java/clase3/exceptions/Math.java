package clase3.exceptions;

public class Math {

    public double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("El argumento b no puede ser 0");
        }
        return a / b;
    }

    public double divideUnChecked(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("El argumento b no puede ser 0");
        }
        return a/ b;
    }
}
