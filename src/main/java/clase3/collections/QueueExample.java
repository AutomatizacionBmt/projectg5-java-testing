package clase3.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        /*fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("pear");
        fruits.add("strawberry");*/

        System.out.println(fruits.size());

        System.out.println(fruits.peek());

        fruits.remove();

        System.out.println(fruits.peek());
        System.out.println(fruits.element());
    }
}
