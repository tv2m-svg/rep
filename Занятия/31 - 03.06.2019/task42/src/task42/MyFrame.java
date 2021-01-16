
package task42;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {
    private JPanel panel = new JPanel();
    JButton but = new JButton("Add Ball");

    public MyFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(100, 200, 270, 350);
        setLayout(null);
        but.setBounds(50, 10, 160, 20);
        add(but);
        panel.setBounds(30, 40, 200, 200);
        panel.setBackground(Color.WHITE);
        //panel.setBorder(new Border);
        add(panel);
        
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BallThread(panel).start();
            }
        });
        
    

    
    
    
    };
};