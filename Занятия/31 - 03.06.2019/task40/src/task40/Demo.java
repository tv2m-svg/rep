package task40;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Demo {

     public static void main(String[] args) {
         JFrame frame = new JFrame("Task 40");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 400);
         
         TextSubject subject = new TextSubject();
         frame.add(subject, BorderLayout.NORTH);
         
         ListObserver list = new ListObserver();
         frame.add(list, BorderLayout.WEST);
         
         subject.addObserver(list);
         
         AreaObserver area = new AreaObserver();
         frame.add(area, BorderLayout.EAST);
         
         subject.addObserver(area);
         
         frame.setVisible(true);
    }
    
}
