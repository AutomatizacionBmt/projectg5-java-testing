package clase3.datatypes;

public class StringExample {

    public static void main(String[] args) {
        String name = "Giancarlo";
        String name2 = new String("giancArlo");
        char[] miChar = { '!', 'c', 'd' };

        String charString = new String(miChar);
        System.out.println(charString);

        if (name.equalsIgnoreCase(name2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
