
package reversetester;


public class Demo {

    
    public static void main(String[] args) {
        StringBuilder words = new StringBuilder("deliver star maps");

      

      String reversed = words.reverse().toString();

      System.out.println(reversed);   
      // Also print out what you expect
      System.out.println("Expected: spam rats reviled");
    }
    
}
