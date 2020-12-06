package clase3.poo.inheritance;

import java.time.LocalDate;

public class Teacher extends Person {

    private String grade;
    private String teacherId;

    public Teacher(String name, String lastName, String email, LocalDate birthDate, String grade, String teacherId) {
        super(name, lastName, email, birthDate);
        this.grade = grade;
        this.teacherId = teacherId;
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

    @Override
    public void goToSalon() {
        System.out.println("Soy el profesor y voy a clases porque tengo que dictarlas");
    }

    public void takeExam() {
        System.out.println("Soy el profesor y hoy jalo a mis alumnos");
    }
}
