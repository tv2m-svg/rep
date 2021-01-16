
package prtask24;

import java.util.*;


public class ExamList extends ArrayList<Exam> {
    
    public void printUp(){
        this.sort(null);
        System.out.println("examsUp = " + this);
    }
    
    public void printDown() {
        this.sort(new Comparator<Exam>() {
            @Override
            public int compare(Exam o1, Exam o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("examsDown = " + this);
    }
    
    public Set<String> calculateSubjects(){
        Set<String> result = new TreeSet<>();
            for (Exam exam : this){
                result.add(exam.getSubject());            
            }
        return result;
    }
    
    public List<Exam> findAll1(int number){
        List<Exam> result = new ArrayList<>();
        for (Exam exam : this){
            if(exam.getNumber()==number){
                result.add(exam);
            }
        }
        return result;
    }
    
    public List<Exam> findAll2(UnaryPredicate<Exam> predicate){
        List<Exam> result = new ArrayList<>();
        for (Exam exam : this){
            if(predicate.test(exam)){
                result.add(exam);
            }
        }
        return result;
    }
    
    public Map<String, Double> calculateAverage(){
        Map<String, Double> result = new TreeMap<>();
        Set<String> set = this.calculateSubjects();        
        for(String subject : set){
            double sum = 0;
            int count = 0;
            for (Exam exam : this){
                if(exam.getSubject().equals(subject)){
                    sum += exam.getMark();
                    ++count;
                }
            }
            result.put(subject, sum/count);
        }
        return result;
    }
    
    static public double calculateAverageByList(List<Exam> exams){
        double sum = 0.;
        int count = 0;
        for (Exam exam : exams){
            sum += exam.getMark();
            ++count;               
        }
        return sum/count;
    }
}
