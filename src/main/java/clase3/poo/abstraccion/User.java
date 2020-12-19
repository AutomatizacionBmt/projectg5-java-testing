package clase3.poo.abstraccion;

import java.util.Objects;

public class User {

    private String dni;
    private String name;
    private String lastName;
    private String email;

    public User(String dni, String name, String lastName, String email) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(dni, user.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
