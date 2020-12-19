package clase3.exceptions.customized;

public class NoOvertimeAllowedException extends Exception {

    private String message;

    public NoOvertimeAllowedException(String message) {
        super(message);
    }
}
