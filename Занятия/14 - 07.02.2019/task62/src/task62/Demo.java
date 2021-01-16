
package task62;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

    
    public static void main(String[] args){
        Triangle tr1;
        try {
            tr1 = new Triangle(4,3,5);
            System.out.println("tr1 = " + tr1);
            System.out.println("type = " + tr1.getType());
        } catch (Exception ex) {
            System.err.println("ex = " + ex);
        }
        
    }
    
}
