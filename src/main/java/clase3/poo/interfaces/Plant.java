package clase3.poo.interfaces;

public class Plant implements LivingBeing  {
    @Override
    public void feed() {
        System.out.println("Tengo " + AGE_MAX + " años y me alimento a traves de la fotosintesis");
    }

    @Override
    public void test() {
        System.out.println("Test");
    }
}
