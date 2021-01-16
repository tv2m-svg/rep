package task39;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExamList  {
    
    private List<Exam> exams = new ArrayList<>();
    private IReportable stratagy = new StrategyA();
    
    public void add(Exam exam){
        exams.add(exam);
    }

    public void setStrategy(IReportable stratagy) {
        this.stratagy = stratagy;
    }
    
    public String executeStrategy(){
        return stratagy.create(exams);
    }

    @Override
    public String toString() {
        return "ExamList{" + "exams=" + exams + '}';
    }
    
    
    public Set<String> calculateSubjects() {
        Set<String> result = new TreeSet<>();
        for (Exam exam : exams) {
            result.add(exam.getSubject());
        }
        return result;
    }

    public List<Exam> findAll1(int number) {
        List<Exam> result = new ArrayList<>();
        for (Exam exam : exams) {
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
            for (Exam exam : exams) {
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
