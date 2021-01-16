package prtask38;

import java.util.*;

public class Polynomial {
    private Map<Integer,Double> poly = new HashMap<>();
    
    public void put(Integer key, Double value) {
        poly.put(key, value);
    }

    @Override
    public String toString() {
        return "Polynomial{" + "poly=" + poly + '}';
    }

    public Polynomial add(Polynomial other) {
        // poly+other.poly
        Polynomial sum = new Polynomial();
        sum.poly.putAll(this.poly);
        for(Map.Entry<Integer, Double> entry : other.poly.entrySet()) {
            Integer key = entry.getKey();
            if (sum.poly.containsKey(key)) {
               sum.poly.put(key, sum.poly.get(key)+entry.getValue());
            } else {
                sum.poly.put(key, entry.getValue());
            }
        }
        
        return sum;
    }
    
}
