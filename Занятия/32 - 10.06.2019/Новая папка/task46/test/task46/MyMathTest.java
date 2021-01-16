package task46;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyMathTest {
    private int a, b, expResult;

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }
    @Parameters
    public static Collection<Object[]> numbers() {
        return Arrays.asList(new Object[][]{
            {1, 2, 3},
            {2, -3, -1},
            {1, 1, 2}});
    }


    /**
     * Test of add method, of class MyMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add: " + a + ", " + b);
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of div method, of class MyMath.
     */
    @Ignore
    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivByZero() {
        System.out.println("div by zero");
        int a = 2;
        int b = 0;
        int expResult = 2;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }

   @Ignore
   @Test
    public void testDiv() {
        System.out.println("div");
        int a = 2;
        int b = 1;
        int expResult = 2;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }
    
}
