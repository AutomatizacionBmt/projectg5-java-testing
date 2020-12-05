package clase3;

import java.util.Random;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Giancarlo");
        students[1] = new Student("Elvis");
        students[2] = new Student("Ashley");

        for(Student student : students) {
            System.out.println("Estudiante: " + student.getName());
        }

        int[][] numbers = new int[2][3];

        Random random = new Random();
        for(int row = 0; row < 2; row++) {
            for(int column = 0; column < 3; column++) {
                numbers[row][column] = random.nextInt(10) + 1;
            }
        }
    }
}
