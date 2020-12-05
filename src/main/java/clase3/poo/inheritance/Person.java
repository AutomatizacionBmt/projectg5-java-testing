package clase3.poo.inheritance;

import java.time.LocalDate;

public class Person {

    protected String name;
    protected String lastName;
    protected String email;
    protected LocalDate birthDate;

    public Person(String name, String lastName, String email, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
    }
}
