package task45;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Calculation implements Runnable {

    private double d = 1.;

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

}

public class Demo {

    public static void main(String[] args) {
        
//        new Thread (new Calculation()).start();
        
        JFrame jfrm = new JFrame();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(100, 200);
        JButton jbnn = new JButton("Hello");
        jbnn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfrm, "Hello from Button");
            }
        });
        jfrm.add(jbnn);
       
        jfrm.setVisible(true); 
        new Calculation().run();
    }

}
