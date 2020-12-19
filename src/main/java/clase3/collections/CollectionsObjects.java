package clase3.collections;

import clase3.poo.abstraccion.Animal;
import clase3.poo.abstraccion.CarnivoreAnimal;
import clase3.poo.abstraccion.HerbivorousAnimal;
import clase3.poo.abstraccion.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsObjects {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new CarnivoreAnimal());
        list.add(new HerbivorousAnimal());

        // list.forEach(animal -> animal.feed());

        Set<User> users = new HashSet<>();
        users.add(new User("44444444", "Giancarlo", "Yarleque", "giancarlo2709@gmail.com"));
        users.add(new User("44444444","Giancarlo", "Juarez", "giancarlo2709@gmail.com"));
        users.add(new User("12345678","Johana", "Zapata", "micorreo@gmail.com"));
        users.add(new User("87654321", "Jair", "vega", "micorreo2@gmail.com"));
        users.add(new User("33333333","Angelica", "Negron", "micorreo3@gmail.com"));

        users.forEach(user -> {
            System.out.println("DNI: " +user.getDni() + " Nombres: " + user.getName() + " Apellidos: "
                    + user.getLastName() + " Email: " + user.getEmail());
        });
    }
}
