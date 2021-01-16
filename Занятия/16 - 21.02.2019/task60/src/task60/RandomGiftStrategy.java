
package task60;

import java.util.*;


public class RandomGiftStrategy implements GiftStrategy {

    @Override
    public List<Candy> getListCandy(List<Candy> storage, int weight) throws NotEnoughWeightException {
        if (storage.isEmpty()){
            throw new NotEnoughWeightException("Empty Storage!!!");
        }
        List<Candy> result = new ArrayList<>();
        int w = 0;
        Random rand = new Random();
        int size = storage.size();
        while (w<weight){
            int i = rand.nextInt(size);
            Candy candy = storage.get(i);
            result.add(candy);
            w += candy.getWeight();
        }
        return result;
    }
    
}
