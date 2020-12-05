package clase3.poo.inheritance;

import java.time.LocalDate;

public class Teacher {

    private String name;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private String grade;
    private String teacherId;

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void goToSalon() {
        System.out.println("Soy el profesor y voy a clases porque tengo que dictarlas");
    }

    public void takeExam() {
        System.out.println("Soy el profesor y hoy jalo a mis alumnos");
    }
}
