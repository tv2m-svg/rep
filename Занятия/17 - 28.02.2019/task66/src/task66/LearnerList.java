package task66;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnerList <Type extends Learner> {
    private List<Type> list = new ArrayList<>();
    
    public void add(Type learner){
        list.add(learner);
    }
    
    public void print(){
        System.out.println('[');
        for (Type elem : list){
            System.out.println(elem);
        }
        System.out.println(']');
    }
    
    public int count(Type learner){
//        int n=0;
//        for (Type elem : list){
//            if (elem.equals(learner)){
//                ++n;
//            }
//        }
//        return n;
        return Collections.frequency(list, learner);
    }
    
    public Type find(Type learner){
        List<Type> copy = new ArrayList<>(list);
        copy.sort(null);
        int index = Collections.binarySearch(copy, learner);
        if (index >= 0)
            return copy.get(index);
        return null;
    }
    
    public Type min(){
        return Collections.min(list);
    }
    
}
