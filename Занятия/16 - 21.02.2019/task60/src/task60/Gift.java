package task60;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;

public class Gift extends ArrayList<Candy> {

    private GiftStrategy giftStrategy;

    public void setGiftStrategy(GiftStrategy giftStrategy) {
        this.giftStrategy = giftStrategy;
    }
    
    
    
    @Override
    public String toString() {
        //return list.toString();
        StringBuffer sb = new StringBuffer("Gift {\n");
        for (Candy candy : this) {
            sb.append('\t')
                    .append(candy)
                    .append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    public int calculateWeight() {
        int weight = 0;
        for (Candy candy : this) {
            weight += candy.getWeight();
        }
        return weight;
    }

    public void writeToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        for (Candy candy : this) {
            pw.println(candy.writeToText());
        }
        pw.close();
    }

    public void readFromTextFile(String fileName) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(fileName));
        while (fileScan.hasNext()) {
            Scanner lineScan = new Scanner(fileScan.nextLine());
            String type = lineScan.next();
            switch (type) {
                case "Lollipop":
//                    this.add(new Lollipop(lineScan.next(),lineScan.nextInt(),
//                            lineScan.nextInt(),lineScan.nextBoolean()));
                    this.add(new Lollipop(lineScan));
                    break;
                case "Jelli":
//                    this.add(new Jelli(lineScan.next(),lineScan.nextInt(),
//                            lineScan.nextInt(),lineScan.next()));
                    this.add(new Jelli(lineScan));
                    break;
                case "Chocolate":
//                    this.add(new Chocolate(lineScan.next(),lineScan.nextInt(),
//                            lineScan.nextInt(),lineScan.nextInt()));
                    this.add(new Chocolate(lineScan));
                    break;
            }
            lineScan.close();

        }
        fileScan.close();
    }

    //Найти конфету в подарке, соответсвующу заданному
    //диапазону содержания сахара
    public Candy findBySugar(int left, int right) {
        Candy result = null;
        for (Candy candy : this) {
            int sugar = candy.getSugarPercent();
            if (sugar >= left && sugar <= right) {
                result = candy;
                break;
            }
        }
        return result;
    }

    //Вычислить средний вес конфеты в подарке
    public int middleWeight() {
        return this.calculateWeight() / this.size();
    }
    
    //Вычмслить процент (от веса) конфет заданного типа
    public int findPercentByType(String type){
        int weight = 0;
        for (Candy candy : this) {
            System.out.println(candy.getClass().getSimpleName());
            if (candy.getClass().getSimpleName().equalsIgnoreCase(type)) {
                weight+=candy.getWeight();
            }
        }
        return (weight*100)/this.calculateWeight();
    }
    
    public void createGift(List<Candy> storage, int weight) throws NotEnoughWeightException{
        if (giftStrategy == null){
            return;
        }
        List<Candy> list = giftStrategy.getListCandy(storage, weight);
        this.clear();
        this.addAll(list);
    }

}
