package clase3.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("pear");
        fruits.add("strawberry");

        System.out.println(fruits.size());

        System.out.println(fruits.peek());

        //fruits.remove();

        System.out.println(fruits.peek());
        System.out.println(fruits.element());

        System.out.println("************ Using Iterator ************");

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("************ Using ForEach ************");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("************ Using Java 8 ************");
        // fruits.forEach(fruit -> System.out.println(fruit));
        fruits.forEach(System.out::println);

    }
}
