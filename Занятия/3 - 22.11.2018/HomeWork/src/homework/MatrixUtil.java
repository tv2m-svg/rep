/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Random;

/**
 *
 * @author Антон
 */
public class MatrixUtil {

    public static void fill(int[][] m) {
        Random rand = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j=0;j<m[i].length;j++) {
                m[i][j] = rand.nextInt(6);
            }
        }

    }

    public static void print(int[][] m) {
        for (int[] i : m) {
            for (int j : i) {
                System.out.printf("%d  ", j);
            }
            System.out.println();
        }
    }

    public static void nulls1(int[][] m) {
        for (int j = 0; j < (m.length * m[0].length); j++) {
            for (int i = 0; i < (m.length * m[0].length) - 1; i++) {
                if (m[i / m[0].length][i % m[0].length] == 0) {
                    m[i / m[0].length][i % m[0].length] = m[(i + 1) / m[0].length][(i + 1) % m[0].length];
                    m[(i + 1) / m[0].length][(i + 1) % m[0].length] = 0;

                }
            }
        }
    }

    public static void nulls(int[][] m) {
        for (int[] m1 : m) {
            ArrayUtil.nulls(m1);
        }
    }

    public static Position maxPos(int[][] m) {
        int row = 0, col = ArrayUtil.maxPos(m[0]);
        for (int i = 0; i < m.length; i++) {
            int j = ArrayUtil.maxPos(m[i]);
            if (m[i][j] > m[row][col]) {
                row = i;
                col = j;
            }
        }
        return new Position(row, col);
    }

    public static int digMin(int[][] m) {
        int[] a = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            a[i] = m[i][i];
        }
        int min = ArrayUtil.min(a);
        return min;
    }

    public static int maxSt(int[][] m) {
        int max = m[maxPos(m).getRow()][maxPos(m).getColum()];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] == max) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static int countRowContainsZero (int[][]m){
        int count=0;
        for(int[] row:m){
            if(ArrayUtil.containsZero(row)){
                ++count;
            }
        }
        return count;
    }
    
    public static int[][] multiplication (int[][]a,int[][]b){
        int[][]c= new int[a.length][b[0].length];
        int mul=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    mul+=a[i][k]*b[k][j];
                }
                c[i][j]=mul;
                mul=0;
            }
        }
        return c;
    }
}
