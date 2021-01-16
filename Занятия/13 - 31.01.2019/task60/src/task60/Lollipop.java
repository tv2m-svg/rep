package task60;

public class Lollipop extends Candy {

    private boolean isFilling;

    public Lollipop(String name, int weight, int sugarPercent, boolean isFilling) {
        super(name, weight, sugarPercent);
        this.isFilling = isFilling;
    }

    @Override
    public String toString() {
        return "Lollipop{" +super.toString()+ "isFilling=" + isFilling + '}';
    }

    @Override
    public String show() {
        return String.format("%10s %s %b",this.getClass().getSimpleName(),super.show(), this.isFilling); 
    }
    
    

}
