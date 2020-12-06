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

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void goToSalon() {
        System.out.println("Tienen que ir a clases");
    }

    public void printNameComplete() {
        System.out.println(this.name + " " + this.lastName);
    }
}
