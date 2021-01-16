
package prtask34;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class Demo {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Task34"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        
        DrawingPanel dp1 = new DrawingPanel();
        DrawingPanel dp2 = new DrawingPanel();
        
        frame.setLayout(new GridLayout(1,2));
        frame.add(dp1);
        frame.add(dp2);
        
        frame.setVisible(true);
        
    }
    
}
