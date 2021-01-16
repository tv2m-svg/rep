package prtask30;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Demo {

    public static void main(String[] args) {
        JFrame jfrm = new JFrame("Component JList");
        jfrm.setSize(650, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultListModel <String> items = new DefaultListModel<>();
        items.addElement("item1");
        items.addElement("item2");
        items.addElement("item3");
        JList list = new JList(items);
        jfrm.getContentPane().add(list);
        
        JButton button = new JButton("Add to JList");
        jfrm.getContentPane().add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                items.addElement("Item" + rand.nextInt(1000));
            }
        });
        
        
        jfrm.setVisible(true);
    }
    
}
