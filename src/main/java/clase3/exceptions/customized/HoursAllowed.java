package clase3.exceptions.customized;

public class HoursAllowed {

    static int hours = 50;

    public static void main(String[] args) throws NoOvertimeAllowedException {
        if (hours > 48) {
            throw new NoOvertimeAllowedException("Horas extras no estan permitidas");
        }
    }
}
