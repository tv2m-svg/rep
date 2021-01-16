
package task60;

abstract public class Candy implements Comparable<Candy>{
    private String name;
    private int weight, sugarPercent;

    public Candy(String name, int weight, int sugarPercent) {
        this.name = name;
        this.weight = weight;
        this.sugarPercent = sugarPercent;
    }

    @Override
    public String toString() {
        return "Candy{" + "name=" + name + ", weight=" + weight + ", sugarPercent=" + sugarPercent + '}';
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
    
    
   
    
    
}
