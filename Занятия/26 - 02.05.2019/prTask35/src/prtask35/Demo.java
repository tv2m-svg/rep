
package prtask35;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Demo {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("TASK35");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingPanel dp = new DrawingPanel();
        frame.add(dp, BorderLayout.CENTER);
        
        JButton buttonDX = new JButton("Change DX");
        frame.add(buttonDX, BorderLayout.NORTH);
        buttonDX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = JOptionPane.showInputDialog(frame, "Enter DX: ");
                if (!answer.equals("")){
                    dp.setDx(Integer.parseInt(answer));
                }
                dp.requestFocusInWindow();
            }
        });
        JButton buttonColor = new JButton("Change Color");
        frame.add(buttonColor, BorderLayout.SOUTH);
        buttonColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(frame, "Chose Color", dp.getColor());
                if (newColor!=null){
                    dp.setColor(newColor);
                    dp.repaint();
                }
                dp.requestFocusInWindow();
            }
        });
        
        frame.setVisible(true);
    }
    
}
