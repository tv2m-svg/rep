package by.bsu.task66;

abstract public class Learner {
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
    
}
