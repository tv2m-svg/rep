/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task48;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author student
 */
public class VectorsTest {
    
    public VectorsTest() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{1,2}, new int[]{1,2}));
  
        assertFalse(Vectors.equal(new int[]{1,2}, new int[]{2,1}));
        
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    //@Ignore
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        assertEquals(0, Vectors.scalarMultiplication(new int[]{},new int[]{}));
    }
    
}
