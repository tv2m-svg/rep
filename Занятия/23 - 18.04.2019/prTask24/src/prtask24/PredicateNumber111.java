package prtask24;

public class PredicateNumber111 implements UnaryPredicate<Exam>{

    @Override
    public boolean test(Exam obj) {
        return obj.getNumber()==111;
    }
    
}

class PredicateNumber implements UnaryPredicate<Exam> {

    private int number;

    public PredicateNumber(int number) {
        this.number = number;
    }
    
    @Override
    public boolean test(Exam obj) {
        return obj.getNumber()==number;
    }
    
}

class PredicateSubject implements UnaryPredicate<Exam> {

    private String subject;

    public PredicateSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public boolean test(Exam obj) {
        return obj.getSubject().equals(subject);
    }
    
}


