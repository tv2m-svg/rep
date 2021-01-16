/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maputil;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author student
 */
public class MapUtil {

    public Map<String, Integer> makeMap(String[] words) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], words[i].length());
        }
        return map;
    }
}
