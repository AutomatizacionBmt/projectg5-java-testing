package clase3.poo.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {
        LivingBeing plant = new Plant();

        print(plant);

        LivingBeing carnivore = new CarnivoreAnimal();
        print(carnivore);

        LivingBeing rareAnimal = new RareAnimal();
        print(rareAnimal);
    }

    public static void print(LivingBeing livingBeing) {
        livingBeing.feed();
        livingBeing.test();
    }

    //CRUD Create, Read, Update, Delete
}
