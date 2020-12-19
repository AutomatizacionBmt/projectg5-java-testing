package clase3.poo.polimorfhysmo;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void groan() {
        System.out.println("Quiquiriqui");
    }
}
