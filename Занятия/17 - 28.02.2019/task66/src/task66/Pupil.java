package task66;

public class Pupil extends Learner {

    private int grade;
    private Behavior behavior;

    public Pupil(String name, String schoolName, double averageResult, int grade, Behavior behavior) {
        super(name, schoolName, averageResult);
        this.grade = grade;
        this.behavior = behavior;
    }

    @Override
    public String toString() {
        return "Pupil{" + super.toString() + "grade=" + grade + ", behavior=" + behavior + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Pupil other = (Pupil) obj;
        if (this.grade != other.grade) {
            return false;
        }
        if (this.behavior != other.behavior) {
            return false;
        }
        return super.equals(obj);
    }
    
    

}
