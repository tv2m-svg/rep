package task60;

import java.util.Scanner;

public class Lollipop extends Candy {

    private boolean isFilling;

    public Lollipop(String name, int weight, int sugarPercent, boolean isFilling) {
        super(name, weight, sugarPercent);
        this.isFilling = isFilling;
    }
    
    public Lollipop(Scanner scan){
        super(scan);
        this.isFilling = scan.nextBoolean();
    }

    @Override
    public String toString() {
        return "Lollipop{" +super.toString()+ "isFilling=" + isFilling + '}';
    }

    @Override
    public String writeToText() {
        return String.format("%10s %s %b",this.getClass().getSimpleName(),super.writeToText(), this.isFilling); 
    }
    
    

}
