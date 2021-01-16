
package javaapplication4;


public class Fraction {
    // a/b
    private int a,b;
  

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{" + a +'/' +b + '}';
    }
    
    public Fraction add(Fraction f2){
        return new Fraction(a*f2.b+f2.a*b,b*f2.b);
    }
}
