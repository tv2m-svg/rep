
package task39;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyB implements IReportable{
    
    private class MyComparator implements Comparator<Exam>{

        @Override
        public int compare(Exam o1, Exam o2) {
            return o1.getSubject().compareTo(o2.getSubject());
        }


        
    }

    @Override
    public String create(List<Exam> exams) {
        Collections.sort(exams, new MyComparator());
        StringBuilder sb = new StringBuilder();
        for(Exam exam: exams){
            sb.append(String.format("%s %d %d%n",  
                    exam.getSubject(), exam.getNumber(), exam.getMark()));
        }
        return sb.toString();
    }
    
}
