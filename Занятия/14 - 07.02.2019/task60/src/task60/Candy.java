
package task60;

import java.util.Scanner;

abstract public class Candy implements Comparable<Candy>{
    private String name;
    private int weight, sugarPercent;

    public Candy(String name, int weight, int sugarPercent) {
        this.name = name;
        this.weight = weight;
        this.sugarPercent = sugarPercent;
    }
    
    public Candy(Scanner scan){
        this.name = scan.next();
        this.weight = scan.nextInt();
        this.sugarPercent = scan.nextInt();
    }

    @Override
    public String toString() {
        return "Candy{" + "name=" + name + ", weight=" + weight + ", sugarPercent=" + sugarPercent + '}';
    }
    
    public String writeToText(){
        return String.format("%10s %5d %4d", this.name, this.weight, this.sugarPercent);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Candy o){
        //return this.name.compareTo(o.name);
        //return this.weight - o.weight;
        return -Integer.compare(this.weight, o.weight);
    }

    public String getName() {
        return name;
    }

    public int getSugarPercent() {
        return sugarPercent;
    }
    
    
    
    
   
    
    
}
