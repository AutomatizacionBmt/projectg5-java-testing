package clase3.poo.interfaces;

public class CarnivoreAnimal implements LivingBeing {
    @Override
    public void feed() {
        System.out.println("Yo vivo menos de 10 años y me alimento de carne");
    }

    @Override
    public void test() {
        System.out.println("Test animal carnivore");
    }
}
