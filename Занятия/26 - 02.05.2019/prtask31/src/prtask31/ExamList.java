package prtask31;

import java.io.*;
import java.util.*;

public class ExamList extends ArrayList<Exam> {

    public void printUp() {
        this.sort(null);
        System.out.println("exams = " + this);
    }

    public void printDown() {
        Collections.sort(this, Collections.reverseOrder());
        System.out.println("exams = " + this);
    }

    public Set<String> calculateSubjects() {
        Set<String> result = new TreeSet<>();
        for (Exam exam : this) {
            result.add(exam.getSubject());
        }
        return result;
    }

    public List<Exam> findAll1(int number) {
        List<Exam> result = new ArrayList<>();
        for (Exam exam : this) {
            if (exam.getNumber() == number) {
                result.add(exam);
            }
        }
        return result;
    }

    // Вычислить средний балл по каждому предмету
    public Map<String, Double> calculateAverageBySubject() {
        Map<String, Double> result = new TreeMap<>();
        Set<String> set = this.calculateSubjects();
        for (String subject : set) {
            double sum = 0.;
            int count = 0;
            for (Exam exam : this) {
                if (subject.equals(exam.getSubject())) {
                    sum += exam.getMark();
                    ++count;
                }
            }
            result.put(subject, sum / count);
        }
        return result;
    }

    static public double calculateAverageByList(List<Exam> exams) {
        double sum = 0.;
        int count = 0;
        for (Exam exam : exams) {
            sum += exam.getMark();
            ++count;
        }
        return sum / count;
    }
    
}
