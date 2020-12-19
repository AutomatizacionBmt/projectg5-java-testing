package clase3.collections.exercise;

import java.util.Map;

/*
A unos estudiantes se les dió un examen sorpresa, y colectivamente no lo hicieron tan bien. Como resultado,
el Profesor decidió darles un examen de recuperación para permitirles mejorar sus puntajes.
Teniendo en cuenta dos Maps de puntajes de las pruebas, actualice las calificaciones de los estudiantes solo si
obtuvieron mejores resultados en el examen de recuperación.

Imprime las calificaciones finales.

 */
public class Exam {

    public static void main(String[] args) {
        Map<String, Double> firstQualification = Qualification.getResultFirstExam();
        Map<String, Double> secondQualification = Qualification.getResultSecondExam();

        for(Map.Entry<String, Double> qualification : secondQualification.entrySet()) {
            Double resultFirstExam = firstQualification.get(qualification.getKey());
            Double resultSecondExam = qualification.getValue();

            if (resultSecondExam > resultFirstExam) {
                firstQualification.put(qualification.getKey(), resultSecondExam);
            }
        }

        System.out.println("Calificaciones finales");
        firstQualification.forEach((key, value) -> System.out.println("Student: " + key + "; Qualification: " + value));
    }
}
