
package task60;

import java.util.Scanner;


public class Chocolate extends Candy {
    private int cocoaPercent;

    public Chocolate( String name, int weight, int sugarPercent, int cocoaPercent) {
        super(name, weight, sugarPercent);
        this.cocoaPercent = cocoaPercent;
    }
    
    public Chocolate(Scanner scan){
        super(scan);
        this.cocoaPercent = scan.nextInt();
    }


    @Override
    public String toString() {
        return "Chocolate{" +super.toString()+ "cocoaPercent=" + cocoaPercent + '}';
    }
    
    @Override
    public String writeToText() {
        return String.format("%10s %s %d",this.getClass().getSimpleName(),super.writeToText(), this.cocoaPercent); 
    }
    
    
}
