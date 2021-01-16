
package task39;

import java.util.Collections;
import java.util.List;

public class StrategyA implements IReportable{

    @Override
    public String create(List<Exam> exams) {
        Collections.sort(exams);
        StringBuilder sb = new StringBuilder();
        for(Exam exam: exams){
            sb.append(String.format("%d %s %d%n",  
                    exam.getNumber(), exam.getSubject(), exam.getMark()));
        }
        return sb.toString();
    }
    
}
