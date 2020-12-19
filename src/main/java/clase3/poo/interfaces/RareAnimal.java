package clase3.poo.interfaces;

public class RareAnimal implements LivingBeing {

    @Override
    public void feed() {
        System.out.println("Soy un animal raro y me alimento de meteoritos");
    }

    @Override
    public void test() {
        System.out.println("Test rare animal");
    }
}
