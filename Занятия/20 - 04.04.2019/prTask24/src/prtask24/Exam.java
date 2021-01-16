
package prtask24;


public class Exam implements Comparable<Exam> {
    private int number;
    private String subject;
    private int mark;

    public Exam(int number, String subject, int mark) {
        this.number = number;
        this.subject = subject;
        this.mark = mark;
    }

    public int getNumber() {
        return number;
    }

    public String getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    
    
    @Override
    public String toString() {
        return "Exam{" + "Number=" + number + ", Subject=" + subject + ", Mark=" + mark + '}' + '\n';
    }

    @Override
    public int compareTo(Exam o) {
        return number - o.number;
    }
    
    
}
