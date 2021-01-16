package by.bsu.task66;

public class Pupil extends Learner {
    private int grade;
    private Behavior behavior;

    public Pupil(int grade, Behavior behavior, String name, String schoolName, double averageResult) {
        super(name, schoolName, averageResult);
        this.grade = grade;
        this.behavior = behavior;
    }

    @Override
    public String toString() {
        return "Pupil{" + super.toString() + "grade=" + grade + ", behavior=" + behavior + '}';
    }
    
    
    
    
}
