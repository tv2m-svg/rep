
package javaapplication4;


public class JavaApplication4 {

    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,3);
        Fraction sum = f1.add(f2);
        System.out.println("sum=" + sum);
    }
    
}
