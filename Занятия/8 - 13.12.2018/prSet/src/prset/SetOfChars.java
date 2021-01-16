package prset;

import java.util.ArrayList;

class Algorithm{
    public static <T> boolean isFind (T[] arr, T key){
        for(int i=0; i< arr.length;i++){
            if (arr[i].equals(key))
                return true;
        }
        return false;
     }    
}

public class SetOfChars {

    private ArrayList<Character> set;

    public SetOfChars() {
        set = new ArrayList<Character>();
    }

    @Override
    public String toString() {
        return "set=" + set;
    }
    
    public void add (char c){
        set.add(c);
    }
    
    public boolean isFind (char c){
        
}
