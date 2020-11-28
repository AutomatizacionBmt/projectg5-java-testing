package clase2.clases;

public class EjecutaRectangulo {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(18, 15);
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setAncho(15);
        rectangulo2.setLargo(10);

        System.out.println("Area del rectangulo 1 es: " + rectangulo1.calcularArea());
        System.out.println("Perimetro del rectangulo 1 es: " + rectangulo1.calcularPerimetro());

        System.out.println("Area del rectangulo 2 es: " + rectangulo2.calcularArea());
        System.out.println("Perimetro del rectangulo 2 es: " + rectangulo2.calcularPerimetro());
    }
}
