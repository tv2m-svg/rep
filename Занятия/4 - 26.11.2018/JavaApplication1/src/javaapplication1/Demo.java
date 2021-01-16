
package javaapplication1;

import java.util.Arrays;



public class Demo {

    
    public static void main(String[] args) {
        System.out.println("Args!!!");
        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("summa=" + MatrixUtil.sum(args));
        int[][] matr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        MatrixUtil.fill(matr, Integer.parseInt(args[2]));
        MatrixUtil.prin(matr);
        System.out.println("posle sortirovki =");
        MatrixUtil.sortRows(matr);
        MatrixUtil.prin(matr);
        
        

    }
    
}
