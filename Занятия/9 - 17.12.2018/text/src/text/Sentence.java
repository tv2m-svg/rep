package text;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words;
    private char terminalChar;//.?!

    public Sentence() {
        words = new ArrayList<Word>();
        terminalChar = '.';
    }

    @Override
    public String toString() {
        Word first = words.get(0);
        String firstString = first.getWord();
        char firstChar = firstString.charAt(0);
        firstChar = Character.toUpperCase(firstChar);
        String newFirstString = "" + firstChar + firstString.substring(1);        
                
        StringBuffer sb = new StringBuffer(newFirstString + ' ');
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        for(int i=1;i<words.size();i++){
            sb.append(' ')
              .append(words.get(i));
        }
             
        sb.append(terminalChar);
        return sb.toString();
    }

    public void add(Word word){
        words.add(word);
    }

    
    
    
    
}
