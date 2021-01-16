package prtask28;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame(String title, int rows, int cols) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLayout(new GridLayout(rows, cols, 5, 5));
        JButton[] buttons = new JButton[rows*cols];
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JButton)e.getSource()).setText("!!!");
                ((JButton)e.getSource()).setBackground(Color.GREEN);
            }
        };
        for (int i=0; i<buttons.length; ++i) {
            JButton but = new JButton("" + i);
            but.setBackground(Color.orange);
            this.add(but, i/rows, i%cols);
            but.addActionListener(listener);
        }
    }
}
