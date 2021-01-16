
package javaapplication4;

import java.util.Random;

public class ArrayUtil {

    public static void fill(int[] array) {
        Random random = new Random();
        for (int index = 0; index < array.length; ++index) {
            array[index] = random.nextInt(201) - 100;
        }
    }

    public static void print(int[] array) {
        for (int index = 0; index < array.length; ++index) {
            System.out.printf("%5d", array[index]);
        }
        System.out.println();
    }

    public static int max(int[] array) {
        int max;
        max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > max) {
                max = array[i + 1];
            }
        }
        return max;

    }
    
    public static void findReplace(int[] array){
        int m = max(array);
        for(int i=0;i<array.length;i++){
            if (array[i]<0)
                array[i]=m;                            
        }
    }
    
    public static int[] copyArray(int[] array){
        int[] copy = new int[array.length];
        for(int i=0; i<copy.length; ++i){
            copy[i] = array[i];
        }
        return copy;
    }
}
