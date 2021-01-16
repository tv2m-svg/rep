
package javaapplication3;

import java.util.Arrays;
import java.util.Random;


public class JavaApplication3 {

    
    public static void main(String[] args) {
/*        int[] intArray = new int [20];
        Random random = new Random();
        for(int index=0; index<intArray.length;++index){
            intArray[index] = random.nextInt(1001);
        }
        System.out.println("Before Sort: " + Arrays.toString(intArray));
        Mylib.insertionSortDown(intArray);
        System.out.println("Before Sort: " + Arrays.toString(intArray));
*/
        int[] a = {1,2,3,4,5};   
        int[] b = {2,4,6,7,8};
        int[] c = Mylib.unionOfArrays(a, b);
        System.out.println("Intersection=" + Arrays.toString(c));

    
        
        
    }
    
}
