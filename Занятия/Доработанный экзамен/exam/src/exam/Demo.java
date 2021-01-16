
package exam;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException{
        
        Garage gar;
        gar = new Garage();
        PassengerCar car1 = new PassengerCar("car","blue",Fuel.PETROL,"leather");
        PassengerCar car2 = new PassengerCar("car1","red",Fuel.PETROL,"leather");
        PassengerCar car3 = new PassengerCar("ford","green",Fuel.DIESEL,"leatherette");
        PassengerCar car4 = new PassengerCar("mitsubisi","black",Fuel.PETROL,"leatherette");
                
        Bus bus1 = new Bus("fordBus","blue",Fuel.PETROL,2,10);
        Bus bus2 = new Bus("car2","black",Fuel.PETROL,3,30);
        Bus bus3 = new Bus("mitsubiBus","red",Fuel.DIESEL,4,40);
        
        
        try {
            gar.addAuto(car1);
            gar.addAuto(car2);
            gar.addAuto(car3);
            gar.addAuto(car4);
            gar.addAuto(bus1);
            gar.addAuto(bus2);
            gar.addAuto(bus3);
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        
        System.out.println("gar = " + gar.toString());
        
        gar.deleteAuto("car");
        System.out.println("После удаления = " + gar.toString());
        
        
        System.out.println("После сортировки = " + gar.titleSort());
        
        System.out.println("По топливу = " + gar.byFuel(Fuel.DIESEL));
        
        System.out.println("По цвету = " + gar.countColor("red"));
        
        gar.writeToTextFile("gar.txt");
        
        
        
        
    }
    
}
