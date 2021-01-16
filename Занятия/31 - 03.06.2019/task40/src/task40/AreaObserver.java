package task40;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JTextArea;

public class AreaObserver extends JTextArea implements Observer {

    private Map<Character, Integer> map = new TreeMap<>();

    @Override
    public void update(char c) {
        //append("" + c + '\n');
        addToMap(c);
        showMap();
    }

    private void addToMap(char c) {
        Integer i = map.get(c);
        if (i==null){
            map.put(c, 1);
        }else{
            map.put(c, i+1);
        }
    }

    private void showMap() {
        this.setText("");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            append(""+ entry.getKey()+ " - " + entry.getValue()+'\n');
                        
        }
    }
}
