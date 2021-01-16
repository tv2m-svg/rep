package task60;

import java.util.ArrayList;
import java.util.List;

public class Task60 {

    public static void main(String[] args) {
        List<Candy> gift = new ArrayList<>();
        gift.add(new Lollipop("Marcipan", 12, 31, false));
        gift.add(new Lollipop("Marcipan", 12, 31, false));
        gift.add(new Lollipop("Marcipan", 12, 31, false));
        gift.add(new Jelli("jelli", 8, 29, "apple"));
        gift.add(new Jelli("Jelli", 8, 29, "apple"));
        gift.add(new Chocolate("Alenka", 100, 67, 35));
        gift.add(new Chocolate("Spartak", 90, 32, 90));

        int number = 1;
        for (Candy candy : gift) {
            System.out.println("" + number++ + ". " + candy);
        }

        //Вычисляем суммарный вес
        int weight = 0;
        for (Candy candy : gift) {
            weight += candy.getWeight();
        }
        System.out.println("Gift weight = " + weight);
        
        gift.sort(null);
        System.out.println("AFTER SORT!!!");
        number=1;
         for (Candy candy : gift) {
            System.out.println("" + number++ + ". " + candy);
        }
    }

}
