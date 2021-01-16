package demo;

import java.util.ArrayList;

public class Text {

    private ArrayList<Sentence> ss = new ArrayList<>();
    private String title;

    public Text(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(title);
        for (int i=0; i<sb.length(); ++i){
            sb.setCharAt(i, Character.toTitleCase(sb.charAt(i)));
        }
        sb.insert(0, '\t');
        sb.append('\n');
        for(Sentence sent:ss){
            sb.append(' ').append(sent);
        }
        return sb.toString();
    }
    
    public void add(Sentence sent){
        ss.add(sent);
    }

}
