
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
    
    
    
    
}
