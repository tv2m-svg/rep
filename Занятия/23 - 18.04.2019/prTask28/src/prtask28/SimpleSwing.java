package prtask28;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleSwing {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        MyFrame frame = new MyFrame("Simple Swing", row, col);
        frame.setSize(450, 300);
        frame.setVisible(true);
    }
    
}
