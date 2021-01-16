package task66;

public class Student extends Learner {
    private int grade;

    public Student(String name, String schoolName, double averageResult, int grade) {
        super(name, schoolName, averageResult);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + "\n\t\tgrade=" + grade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student)obj;
        if (grade!=other.grade)
            return false;
        return super.equals(obj); 
    }

    @Override
    public int hashCode() {
        return super.hashCode(); 
    }

    
    
    
    
}
