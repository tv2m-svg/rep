
package prtask33;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MyFrame extends JFrame{
    
    public MyFrame(String title)  {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        
        JButton butTop = new JButton();
        butTop.setBackground(Color.red);
        JTextField textRed = new JTextField("255");
        JTextField textGreen = new JTextField("0");
        JTextField textBlue = new JTextField("0");
        JButton butColor = new JButton("Color");
        
        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1,4));
        panelBottom.add(textRed);
        panelBottom.add(textGreen);
        panelBottom.add(textBlue);
        panelBottom.add(butColor);
        
        this.setLayout(new GridLayout(2,1));
        this.add(butTop);
        this.add(panelBottom);
        
        butColor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int red = 0;
                int green = 0;
                int blue = 0;
                try{
                red = Integer.parseInt(textRed.getText());
                green = Integer.parseInt(textGreen.getText());
                blue = Integer.parseInt(textBlue.getText());
                } catch(NumberFormatException exc){
                    
                }
                textRed.setText("" + red);
                textGreen.setText("" + green);
                textBlue.setText("" + blue);
                Color color = new Color(red, green, blue);
                butTop.setBackground(color);
            }
        });
    }
}
