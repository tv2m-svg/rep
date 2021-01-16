package task39;

public class Demo {

    public static void main(String[] args) {
        ExamList winterSession = new ExamList();
        winterSession.add(new Exam(111, "MA", 8));
        winterSession.add(new Exam(111, "GA", 7));
        winterSession.add(new Exam(111, "EN", 9));
        winterSession.add(new Exam(222, "MA", 5));
        winterSession.add(new Exam(222, "GA", 5));
        
        
        System.out.println("winter Session="+winterSession);
        System.out.println(winterSession.executeStrategy());
        
        winterSession.setStrategy(new StrategyB());
        System.out.println(winterSession.executeStrategy());
    }
    
}
