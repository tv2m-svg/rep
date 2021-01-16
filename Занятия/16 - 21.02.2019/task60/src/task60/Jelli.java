
package task60;

import java.util.Scanner;

public class Jelli extends Candy {
    private String taste;

    public Jelli(String name, int weight, int sugarPercent, String taste) {
        super(name, weight, sugarPercent);
        this.taste = taste;
    }
    
    public Jelli(Scanner scan){
        super(scan);
        this.taste = scan.next();
    }


    @Override
    public String toString() {
        return "Jelli{" +super.toString()+ "taste=" + taste + '}';
    }
    
    @Override
    public String writeToText() {
        return String.format("%10s %s %b",this.getClass().getSimpleName(),super.writeToText(), this.taste); 
    }
    
    
    
}
