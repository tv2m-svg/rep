
package prtask36;

import javax.swing.AbstractListModel;


public class ExamListModel extends AbstractListModel<Exam> {
    
    private ExamList examList ;
    
    public ExamListModel( ExamList examList) {
        this.examList = examList;
    }
    
    
    @Override
    public int getSize() {
        return examList.size();
    }

    @Override
    public Exam getElementAt(int index) {
        return examList.get(index);
    }
    
    public void addElement(Exam exam){
        examList.add(exam);
        this.fireIntervalAdded(examList, examList.size()-1, examList.size());
    }
    
}
