package task40;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class TextSubject extends JTextField implements Observable{

    private List<Observer> observers =  new ArrayList<>();

    public TextSubject() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = getText();
                notifyObservers(getText().charAt(str.length()-1));
            }
        });
    }
    
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(char c) {
        for(Observer o : observers){
            o.update(c);
        }
    }
    
}
