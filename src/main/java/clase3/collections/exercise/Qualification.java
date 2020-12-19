package clase3.collections.exercise;

import java.util.HashMap;
import java.util.Map;

public class Qualification {

    public static Map<String, Double> getResultFirstExam() {
        Map<String, Double> firstQualification = new HashMap<>();
        firstQualification.put("Angelica", 8.0);
        firstQualification.put("Jair", 9.0);
        firstQualification.put("Johana", 12.0);
        firstQualification.put("Luis", 7.0);
        firstQualification.put("Nilton", 15.0);
        return firstQualification;
    }

    public static Map<String, Double> getResultSecondExam() {
        Map<String, Double> secondQualification = new HashMap<>();
        secondQualification.put("Angelica", 18.0);
        secondQualification.put("Jair", 17.0);
        secondQualification.put("Johana", 16.0);
        secondQualification.put("Luis", 15.0);
        secondQualification.put("Nilton", 12.0);
        return secondQualification;
    }
}
