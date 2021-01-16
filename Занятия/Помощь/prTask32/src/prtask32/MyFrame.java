
package prtask32;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class MyFrame extends JFrame {

    public MyFrame(String title)  {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        
        DefaultListModel<String> model = new DefaultListModel<>();
        try {
            Scanner scanner = new Scanner(new File("data.txt"));
            while(scanner.hasNext()){
                model.addElement(scanner.next());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        JList<String> list = new JList(model);
        JScrollPane scroll = new JScrollPane(list);
        this.getContentPane().add(scroll );
        scroll.setSize(100,100);
        
    }
    
    
    
}
