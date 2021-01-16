package task60;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task60 {

    public static void main(String[] args) throws FileNotFoundException {
        Gift gift = new Gift();
        gift.readFromTextFile("1.txt");
        System.out.println("gift = " + gift);
        System.out.println("sugar = " + gift.findBySugar(30, 32));
        System.out.println("weight = " + gift.calculateWeight());
        System.out.println("midle = " + gift.middleWeight());
        System.out.println("type = " + gift.findPercentByType("Lollipop"));
                       
//        gift.add(new Lollipop("Marcipan", 12, 31, false));
//        gift.add(new Lollipop("Marcipan", 12, 31, false));
//        gift.add(new Lollipop("Marcipan", 12, 31, false));
//        gift.add(new Jelli("jelli", 8, 29, "apple"));
//        gift.add(new Jelli("Jelli", 8, 29, "apple"));
//        gift.add(new Chocolate("Alenka", 100, 67, 35));
//        gift.add(new Chocolate("Spartak", 90, 32, 90));
//        
//        System.out.println("gift = " + gift);
//        System.out.println("size = " + gift.size());
//        System.out.println("gift weight = " + gift.calculateWeight());
//        
//        gift.remove(5);
//        System.out.println("gift = " + gift);
//        
//        gift.sort(null);
//        System.out.println("gift = " + gift);
//        
//        gift.sort(new ComparatorByName());
//        System.out.println("gift = " + gift);
//        
//        gift.writeToTextFile("1.txt");
        
        
                                
    }

}
