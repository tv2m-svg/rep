package demo;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> words;
    private char terminalChar; // . ? !

    public Sentence() {
        words = new ArrayList<Word>();
        terminalChar = '.';
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (!words.isEmpty()) {
            sb.append(words.get(0));
            char firstLetter = sb.charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            sb.setCharAt(0, firstLetter);
            for (int i = 1; i < words.size(); ++i) {
                sb.append(' ');
                sb.append(words.get(i));
            }
        }
        sb.append(terminalChar);

        return sb.toString();
    }

    public void add(Word word) {
        words.add(word);
    }

    public void setTerminalChar(char terminalChar) {
        this.terminalChar = terminalChar;
    }
    
    
}

