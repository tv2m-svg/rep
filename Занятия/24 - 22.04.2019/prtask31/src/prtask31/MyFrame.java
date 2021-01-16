package prtask31;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultListModel<Exam> listModel = new DefaultListModel<>();
        listModel.addElement(new Exam(123, "MA", 8));
        listModel.addElement(new Exam(223, "GA", 7));
        listModel.addElement(new Exam(123, "GA", 9));
        
        JList<Exam> list = new JList(listModel);
        
        this.getContentPane().add(list);
        
        JTextField textNumber = new JTextField();
        JTextField textSubject = new JTextField();
        JTextField textMark = new JTextField();
        JButton buttonAdd = new JButton("Add");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,4));
        panel.add(textNumber);
        panel.add(textSubject);
        panel.add(textMark);
        panel.add(buttonAdd);
        
        this.getContentPane().add(panel, BorderLayout.SOUTH);

        
    }
    
}
