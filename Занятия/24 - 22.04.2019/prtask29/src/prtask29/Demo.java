package prtask29;

import javax.swing.*;

public class Demo {

    public static void main(String[] args) {
        JFrame jfrm = new JFrame("Simple Swing");
        jfrm.setSize(450, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingPanel dp = new DrawingPanel();
        jfrm.getContentPane().add(dp);
        jfrm.setVisible(true);
    }
    
}
