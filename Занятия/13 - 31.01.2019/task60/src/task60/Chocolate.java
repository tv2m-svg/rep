
package task60;


public class Chocolate extends Candy {
    private int cocoaPercent;

    public Chocolate( String name, int weight, int sugarPercent, int cocoaPercent) {
        super(name, weight, sugarPercent);
        this.cocoaPercent = cocoaPercent;
    }

    @Override
    public String toString() {
        return "Chocolate{" +super.toString()+ "cocoaPercent=" + cocoaPercent + '}';
    }
    
    @Override
    public String show() {
        return String.format("%10s %s %d",this.getClass().getSimpleName(),super.show(), this.cocoaPercent); 
    }
    
    
}
