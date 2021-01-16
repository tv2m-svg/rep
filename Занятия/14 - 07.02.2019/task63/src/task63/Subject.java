
package task63;

import java.util.Objects;


public class Subject implements Comparable<Subject> {
    private String subjectName;
    private int hours;

    public Subject(String subjectName, int hours) {
        this.subjectName = subjectName;
        this.hours = hours;
    }
    
    public Subject(){
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName=" + subjectName + ", hours=" + hours + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.subjectName);
        hash = 97 * hash + this.hours;
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
        final Subject other = (Subject) obj;
        if (this.hours != other.hours) {
            return false;
        }
        if (!Objects.equals(this.subjectName, other.subjectName)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Subject o) {
        if (this.hours==o.hours)
            return this.subjectName.compareTo(o.subjectName);
        return -(this.hours-o.hours);
    }
    
    
}
