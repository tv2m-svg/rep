
package prbook;


public class Util {
    public static <T> void printAll(T[] array){
        System.out.println('[');
        for(T elem : array){
            System.out.println("\t" + elem + ' ');
        }
        System.out.println(']');
    }
}
