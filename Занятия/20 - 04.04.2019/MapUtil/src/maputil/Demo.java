
package maputil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

  
    
    public static void main(String[] args) {
        
        MapUtil map = new MapUtil();
        String[] s = {"car","double","integer"};
        System.out.println(map.makeMap(s));
        
        //task 23
        Scanner scan;
        try {
            scan = new Scanner(new File("in.txt"));
        
        Map<String,Integer> freqs = new TreeMap<>();
        while (scan.hasNext()) {
            String key = scan.next();
            Integer f = freqs.get(key); 
            if (f==null) {
                freqs.put(key, 1);   
            } else {
                freqs.put(key, f + 1); 
            }
            
        }
        System.out.println("freqs = " + freqs);
        Set<String> keys1 = freqs.keySet();
        for(String key : keys1){
            System.out.println(key + " - " + freqs.get(key));
        }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
