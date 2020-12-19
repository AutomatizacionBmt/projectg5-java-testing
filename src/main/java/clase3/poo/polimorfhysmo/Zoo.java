package clase3.poo.polimorfhysmo;

public class Zoo {

    public static void main(String[] args) {
        Animal animals[] = new Animal[4];
        animals[0] = new Cat("Michifu");
        animals[1] = new Dog("Betoven");
        animals[2] = new Cat("Minimo");
        animals[3] = new Dog("Laica");

        for (Animal animal : animals) {
            animal.groan();
            if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            } else if (animal instanceof Dog) {
                ((Dog) animal).search();
            }
        }


    }
}
