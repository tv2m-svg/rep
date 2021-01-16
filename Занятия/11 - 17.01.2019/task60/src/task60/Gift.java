
package task60;

import java.util.ArrayList;


public class Gift extends ArrayList<Candy> {

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
    
}
