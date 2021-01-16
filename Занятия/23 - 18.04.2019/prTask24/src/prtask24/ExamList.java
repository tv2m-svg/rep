package prtask24;

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

    public List<Exam> findAll2(UnaryPredicate<Exam> predicate) {
        List<Exam> result = new ArrayList<>();
        for (Exam exam : this) {
            if (predicate.test(exam)) {
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
    
    // сериализацию/десериализацию сведений о результатах сессии
//    public void serialize(String fileName) throws IOException {
//        ObjectOutputStream out = new ObjectOutputStream(
//		new FileOutputStream(fileName));
//        out.writeObject(this.size());
//        for (Exam exam : this) {
//            out.writeObject(exam);
//        }
//        out.close();
//    }
//    
//    public void deserialize(String fileName) throws IOException, ClassNotFoundException {
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
//        this.clear();
//        int size = (int)in.readObject();
//        for (int i=0; i<size; ++i) {
//            Exam exam = (Exam)in.readObject();
//            this.add(exam);
//        }
//        in.close();
//    }

}
