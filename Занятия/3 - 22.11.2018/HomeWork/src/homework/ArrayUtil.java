/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author student
 */
public class ArrayUtil {

    public static void nulls(int[] a) {
        int j = 0; 
            for (int i = 0; i < a.length; i++) {
                if (a[i] != 0) {
                    a[j++] = a[i];                    
                }
            }
            for(;j<a.length;j++){
                a[j]=0;  
            }
        
    }

    public static int maxPos(int[] array) {
        int max=array[0];
        int index=0;
        for(int i=0;i<array.length-1;i++){
            if(max<array[i+1])
                index=i+1;
                max=array[i+1];
        }
        return index;
    }
    
    public static int min(int[] a){
        int min=a[0];
        for(int i=0;i<a.length-1;i++){
            if(min>a[i+1])
                min=a[i+1];
        }
        return min;
    }
    
    public static boolean containsZero (int[] a){
        for(int elem:a){
            if(elem==0)
                return true;
        }
        return false;
    }
}
