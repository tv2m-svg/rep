
package prtask36;

import java.io.*;
import java.util.*;


public class ExamList extends ArrayList<Exam> {
    
    
    public Set<String> calculateSubjects(){
        Set<String> result = new TreeSet<>();
            for (Exam exam : this){
                result.add(exam.getSubject());            
            }
        return result;
    }
    
    public List<Exam> findAll(int number){
        List<Exam> result = new ArrayList<>();
        for (Exam exam : this){
            if(exam.getNumber()==number){
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
}
    