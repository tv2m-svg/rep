
package prtask34;

import javax.swing.JFrame;


public class Demo {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Task34"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        
        DrawingPanel dp = new DrawingPanel();
        frame.add(dp);
        
        frame.setVisible(true);
    }
    
}
