package clase3.datatypes;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    private int number;
    private Integer number2;

    public WrapperClass() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        WrapperClass wrapperClass = new WrapperClass();
        wrapperClass.setNumber2(20);

        long numberPrimitive = wrapperClass.getNumber2().longValue();

        if (wrapperClass.getNumber2().equals(20)) {
            System.out.println("Equals");
        }

        System.out.println("Number: " + wrapperClass.getNumber());
        System.out.println("Number2: " + numberPrimitive);

        double[] numbers = {1.5, 1.8, 1.9, 2.5};
        for(Double numberDouble : numbers) {
            System.out.println("Number int: " + numberDouble.intValue());
        }
    }
}
