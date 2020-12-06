package clase3.poo.inheritance;

import java.time.LocalDate;

public class TestInheritance {

    public static void main(String[] args) {
        Student student = new Student("Giancarlo", "Yarlequé", "giancarlo2709@gmail.com",
                LocalDate.of(1992, 9, 27), "0512008018");

        student.goToSalon();

        student.printNameComplete("Name Complete: ");

        Teacher teacher = new Teacher("José", "Hurtado", "josehumberto17@gmail.com",
                LocalDate.of(1985, 7, 31), "Ingeniero Informatico", "00023");

        teacher.goToSalon();

        teacher.printNameComplete();
    }
}
