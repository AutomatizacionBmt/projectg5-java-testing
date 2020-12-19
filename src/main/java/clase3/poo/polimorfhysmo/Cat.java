package clase3.poo.polimorfhysmo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    protected void groan() {
        System.out.println("Hola me llamo " + name + " y hago miauuu");
    }

    public void scratch() {
        System.out.println("Yo soy un gato y me gusta rasguniar");
    }
}
