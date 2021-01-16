package task40;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ListObserver extends JList implements Observer{

    private DefaultListModel<Character> model =  new DefaultListModel<>();
    

    public ListObserver() {
        this.setModel(model);
        model.addElement('!');
    }
    
    @Override
    public void update(char c) {
        model.addElement(c);
    }
    
}
