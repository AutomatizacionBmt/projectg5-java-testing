package clase3.poo.inheritance;

import java.time.LocalDate;

public class Student {

    private String name;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private String studentId;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void goToSalon() {
        System.out.println("Soy el profesor y voy a clases porque tengo que dictarlas");
    }

    public void toGivenAnExam() {
        System.out.println("Voy a dar mi examen");
    }
}
