package clase3.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        mapDemo();
    }

    private static void mapDemo() {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 95);
        fruits.put("lemon", 20);
        fruits.put("banana", 105);
        fruits.put("apple", 80);

        System.out.println(fruits.size());
        System.out.println(fruits.get("apple"));

        //fruits.clear();
        System.out.println(fruits.isEmpty());

        fruits.remove("apple");

        System.out.println(fruits.containsKey("apple"));
        System.out.println(fruits.containsValue(20));

        System.out.println("************* Using Java 7 *********************");
        for(Map.Entry<String, Integer> entry: fruits.entrySet()) {
            System.out.println("Fruta: " + entry.getKey() + "; Calorias: " + entry.getValue());
        }

        System.out.println("************* Using Java 8 *********************");
        fruits.forEach((key, value) -> System.out.println("Fruta: " + key + "; Calorias: " + value));

    }
}
