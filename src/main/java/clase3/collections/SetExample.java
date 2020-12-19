package clase3.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set<String> fruits = new HashSet<>(5);
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("pear");
        fruits.add("strawberry");

        System.out.println(fruits.contains("apple"));

        fruits.remove("apple");

        System.out.println(fruits.contains("apple"));

        fruits.clear();

        System.out.println(fruits.isEmpty());

        System.out.println(fruits.size()); //
    }
}
