
package task60;

public class Jelli extends Candy {
    private String taste;

    public Jelli(String name, int weight, int sugarPercent, String taste) {
        super(name, weight, sugarPercent);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Jelli{" +super.toString()+ "taste=" + taste + '}';
    }
    
    @Override
    public String show() {
        return String.format("%10s %s %b",this.getClass().getSimpleName(),super.show(), this.taste); 
    }
    
    
    
}
