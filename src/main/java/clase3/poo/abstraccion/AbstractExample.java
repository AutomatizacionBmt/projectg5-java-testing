package clase3.poo.abstraccion;

public class AbstractExample {

    public static void main(String[] args) {
        LivingBeing livingBeing = new Plant();
        livingBeing.feed();

        LivingBeing carnivore = new CarnivoreAnimal();
        carnivore.feed();

        LivingBeing herbivorous = new HerbivorousAnimal();
        herbivorous.feed();
    }
}
