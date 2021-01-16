
package javaapplication1;

import java.util.Arrays;
import java.util.Random;


public class MatrixUtil {
    
    public static int sum (String[] arg){
        int sum=0;
        for(String ar:arg){
            sum+=Integer.parseInt(ar);
        }
        return sum;
    }
    
    public static void prin(int[][] matr){
        for(int[] ar:matr){
            for(int el:ar){
                System.out.format("%4d",el);
            }
            System.out.println();
        }
    }
    
    public static void fill (int[][] matr,int max){
        
        Random rand = new Random();
        for(int i=0;i<matr.length;i++){
            for(int j=0;j<matr[i].length;j++){
                matr[i][j]=rand.nextInt(max);
            }
        }
    }
    
    public static void sortRows (int[][] matr){
        for(int i=0;i<matr.length;i++){
            Arrays.sort(matr[i]);
        }
    }
}
