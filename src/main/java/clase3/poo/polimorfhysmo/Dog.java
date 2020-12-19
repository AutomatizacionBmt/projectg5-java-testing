package clase3.poo.polimorfhysmo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void groan() {
        System.out.println("Hola me llamo " + name + " y hago guau guau");
    }

    public void search() {
        System.out.println("Buscar es divertido!");
    }
}
