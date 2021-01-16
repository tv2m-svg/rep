
package task.pkg65;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

    
    public static void main(String[] args) {
        Series series;
        series = new Liner(1,2);
        System.out.println("series = " + series);
        try {
            series.saveToTxtFile("1.txt", 7);
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
        System.out.println("sum of series = " + series.calcSum(3));
    }
    
}
