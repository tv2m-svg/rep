
package exam;


public class Bus extends Automobile {
    
    private int numberPos;
    private int numberDoors;

    public Bus( String title, String color, Fuel fuel, int numberPos, int numberDoors) {
        super(title, color, fuel);
        this.numberPos = numberPos;
        this.numberDoors = numberDoors;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString()  + 
                ", numberPos=" + numberPos + ", numberDoors=" + numberDoors + '}';
    }
    
    public String writeToText() {
        return String.format("%10s %d %d",super.writeToText(), this.numberPos, this.numberDoors); 
    }
    
}
