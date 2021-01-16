package task66;

import java.util.Objects;

abstract public class Learner implements Comparable<Learner> {
    private String name;
    private String schoolName;
    private double averageResult;

    public Learner(String name, String schoolName, double averageResult) {
        this.name = name;
        this.schoolName = schoolName;
        this.averageResult = averageResult;
    }

    @Override
    public String toString() {
        return "Learner{" + "name=" + name + ", schoolName=" + schoolName + ", averageResult=" + averageResult + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.schoolName);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.averageResult) ^ (Double.doubleToLongBits(this.averageResult) >>> 32));
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
        final Learner other = (Learner) obj;
        if (Double.doubleToLongBits(this.averageResult) != Double.doubleToLongBits(other.averageResult)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.schoolName, other.schoolName)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Learner other){
        if (this.schoolName.equals(other.schoolName))
            return this.name.compareTo(other.name);
        return this.schoolName.compareTo(other.schoolName);
    }
    
    
    
}
