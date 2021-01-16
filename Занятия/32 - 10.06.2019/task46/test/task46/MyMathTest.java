/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task46;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    public MyMathTest() {
    }

    /**
     * Test of add method, of class MyMath.
     */
    @Test
    public void testAdd() {
        System.out.println("Add: 2+5");
        int a = 2;
        int b = 5;
        int expected = a + b;
        int actual = MyMath.add(a, b);
        //проверка
        assertEquals(7, actual);

        //проверка
        assertEquals(-2, MyMath.add(1, -3));
        System.out.println("Add: 1-3");
        
        assertEquals(-2147483648, MyMath.add(1, 2147483647));
        System.out.println("Add: 2147483647+2147483647");
        assertEquals(-2, MyMath.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println("Add: 2147483647+-2147483648");
        assertEquals(-1, MyMath.add(Integer.MAX_VALUE, Integer.MIN_VALUE));


    }

    /**
     * Test of div method, of class MyMath.
     */
    @Test
    public void testDiv() {
        
    }

}
