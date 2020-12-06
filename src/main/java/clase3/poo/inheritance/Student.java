package clase3.poo.inheritance;

import java.time.LocalDate;

public class Student extends Person {

    private String studentId;

    public Student(String name, String lastName, String email, LocalDate birthDate, String studentId) {
        super(name, lastName, email, birthDate);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void goToSalon() {
        System.out.println("Soy el Estudiante y escucho las clases");
    }

    public void toGivenAnExam() {
        System.out.println("Voy a dar mi examen");
    }

    public void printNameComplete(String config) {
        System.out.println(config);
        super.printNameComplete();
    }
}
