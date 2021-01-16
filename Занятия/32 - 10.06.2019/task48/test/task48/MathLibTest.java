package task48;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathLibTest {
    
    public MathLibTest() {
    }

    /**
     * Test of QuadraticEquation method, of class MathLib.
     */
    @Test
    public void testQuadraticEquation() {
        System.out.println("QuadraticEquation");
        double a = 1.0;
        double b = 0.0;
        double c = -1.0;
        Result expResult = new Result(true, 1, -1);
        Result result = MathLib.QuadraticEquation(a, b, c);
        assertTrue(expResult.equals(result));
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
