
package javaapplication4;


public class Demo {

    
    public static void main(String[] args) {
        int[] intArray = new int [10];
        ArrayUtil.fill(intArray);
        ArrayUtil.print(intArray);
        System.out.println("max = "+ArrayUtil.max(intArray));
        ArrayUtil.findReplace(intArray);
        ArrayUtil.print(intArray);
        
        int[] array2 = intArray;
        ArrayUtil.print(array2);
        
        System.out.println("After copyArray()");
        int[] array3 = ArrayUtil.copyArray(intArray);
        ArrayUtil.print(intArray);
        ArrayUtil.print(array3);
        
        int[][] matr = new int [3][4];
        MatrixUtil.print(matr);
        MatrixUtil.fill(matr);
        MatrixUtil.print(matr);
        
        System.out.println("Sum = " + MatrixUtil.sum(matr));
        
    }
    
}
