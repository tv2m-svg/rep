package task60;

import java.util.*;

public class JelliGiftStrategy implements GiftStrategy {

    @Override
    public List<Candy> getListCandy(List<Candy> storage, int weight) throws NotEnoughWeightException {
        List<Candy> result = new ArrayList<>();
        int w = 0;
        for (Candy candy : storage) {
            if (candy instanceof Jelli) {
                result.add(candy);
                w += candy.getWeight();
                if (w >= weight) {
                    break;
                }
            }
        }
        if (w<weight){
            throw new NotEnoughWeightException("Not enough Jelli!!!");
        }
        return result;
    }

}
