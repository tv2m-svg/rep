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
public class Position {
    private int row;
    private int colum;

    public Position(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    public int getRow() {
        return row;
    }

    public int getColum() {
        return colum;
    }
    
    

    @Override
    public String toString() {
        return "Position{" + "row=" + row + ", colum=" + colum + '}';
    }
    
}
