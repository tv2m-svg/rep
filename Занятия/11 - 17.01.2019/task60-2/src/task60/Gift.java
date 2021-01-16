package task60;

import java.util.*;

public class Gift {

    private List<Candy> list = new ArrayList<>();

    public void add(Candy candy) {
        list.add(candy);
    }

    @Override
    public String toString() {
        //return list.toString();
        StringBuffer sb = new StringBuffer("Gift {\n");
        for (Candy candy : list) {
            sb.append('\t')
                    .append(candy)
                    .append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    public int calculateWeight() {
        int weight = 0;
        for (Candy candy : list) {
            weight += candy.getWeight();
        }
        return weight;
    }

    public void printSortedGift() {
        List<Candy> copy = new ArrayList<>(list);
        copy.sort(null);
        System.out.println(copy.toString());
    }
}
