/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Антон
 */
public class HomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]m;
        m = new int[5][5];
        MatrixUtil.fill(m);
        MatrixUtil.print(m);
        Position position = MatrixUtil.maxPos(m);
        System.out.println("max position = " + position);
        System.out.println("max= " + m[position.getRow()][position.getColum()]);
        /*System.out.println("posle ");
        MatrixUtil.nulls(m);
        MatrixUtil.print(m);*/
        Position pos = new Position(2,5);
        System.out.println("pos=" + pos);
        System.out.println("min dioh= " + MatrixUtil.digMin(m));
        System.out.println("max stolbec= " + MatrixUtil.maxSt(m));
        System.out.println("stroci s nulls= " + MatrixUtil.countRowContainsZero(m));
        int[][]a;
        int[][]b;
        a=new int[3][5];
        b=new int[5][4];
        MatrixUtil.fill(a);
        MatrixUtil.fill(b);
        System.out.println("a" );
        MatrixUtil.print(a);
        System.out.println("b" );
        MatrixUtil.print(b);
        System.out.println("c" );
        MatrixUtil.print(MatrixUtil.multiplication(a, b));
        
    }
    
}
