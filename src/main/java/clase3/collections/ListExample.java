package clase3.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        listDemo();
    }

    private static void listDemo() {
        List<String> fruits = new ArrayList<>(5);
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("pear");
        fruits.add("strawberry");

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("apple");
        fruits2.add("lemon");

        //fruits.addAll(fruits2);
        fruits.addAll(3, fruits2);

        System.out.println(fruits.size());
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(5));

        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.lastIndexOf("apple"));

        fruits.remove(8);

        System.out.println(fruits.get(7));

        fruits.set(7, "pear 2");

        System.out.println(fruits.get(7));

        System.out.println(fruits.subList(0, 3));
    }
}
