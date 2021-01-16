package by.bsu.task66;

public class Student extends Learner {
    private int grade;

    public Student(String name, String schoolName, double averageResult, int grade) {
        super(name, schoolName, averageResult);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "grade=" + grade + '}';
    }
    
    
}
