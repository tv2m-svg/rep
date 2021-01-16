
package task60;

import java.util.List;


public interface GiftStrategy {
    List<Candy> getListCandy(List<Candy> storage, int weight) throws NotEnoughWeightException;
}
