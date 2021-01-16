
package prtask36;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Demo {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("TASK 36");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ExamPanel examPanel = new ExamPanel();
        frame.add(examPanel);
        
        
        
        frame.setVisible(true);
        
    }
    
}
