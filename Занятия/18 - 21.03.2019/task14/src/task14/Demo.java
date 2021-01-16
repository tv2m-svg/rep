
package task14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException {
         
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      
      ArrayList<String> words = new ArrayList<String>();
      
      Scanner in1 = new Scanner(s);
      while(in1.hasNext()){
          words.add(in1.next());
      }
      
      System.out.println(words.toString());
      words.sort(null);
      System.out.println(words.toString());
      words.sort(new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
              
              return o1.length() - o2.length();
          }
      });
      System.out.println(words.toString());
      
      PrintWriter pw = new PrintWriter(new File("output.txt"));
      for(int i = words.size();i>=1;i--){
         pw.println(words.get(i-1));
         
      }
      pw.close();
      
    }
    
}
