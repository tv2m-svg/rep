
package exam;


public class PassengerCar extends Automobile {
    
    public String seatMaterial;

    public PassengerCar( String title, String color, Fuel fuel, String seatMaterial) {
        super(title, color, fuel);
        this.seatMaterial = seatMaterial;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() + 
                ", seatMaterial=" + seatMaterial + '}';
    }
    
    public String writeToText() {
        return String.format("%10s %s",super.writeToText(), this.seatMaterial); 
    }
    
}
