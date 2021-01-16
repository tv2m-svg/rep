
package averagetester;


public class Demo {

 
    public static void main(String[] args) {
      String word1 = "Mary";
      String word2 = "had";
      String word3 = "a";
      String word4 = "little";
      String word5 = "lamb";
     
      int length1 = word1.length();
      int length2 = word2.length();
      int length3 = word3.length();
      int length4 = word4.length();
      int length5 = word5.length();
      
      double average;
      average = (double)(length1+length2+length3+length4+length5)/5;
      System.out.println(average);
      System.out.println("Expected: 3.6");
    }
    
}
