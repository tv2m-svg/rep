package task39;

import java.io.Serializable;

public class Exam implements Comparable<Exam>, Serializable{
    private int number;
    private String subject;
    private int mark;

    public Exam(int Number, String Subject, int Mark) {
        this.number = Number;
        this.subject = Subject;
        this.mark = Mark;
    }

    @Override
    public String toString() {
        return "Exam{" + "Number=" + number + ", Subject=" + subject + ", Mark=" + mark + '}' + '\n';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.number;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (this.number != other.number) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Exam o) {
        return number - o.number;
    }
    
    
}
