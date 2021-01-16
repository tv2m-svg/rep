
package demo;


public class Fraction implements Comparable<Fraction>{
    //a/b
    private int a, b;
    
    private int nod(int c, int d) {
        while (c != d) {
            if (c > d) {
                c = c - d;
            } else {
                d = d - c;
            }
        }
        return c;
    }
    
    private void reduce(){
        int n = nod(a, b);
        a = a / n;
        b = b / n;
    }

    public Fraction(int a, int b) {        
        this.a = a;
        this.b = b;
        reduce();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
        reduce();
        
    }

    public void setB(int b) {
        this.b = b;
        reduce();
    }

    @Override
    public String toString() {
        return "{" + a + "/" + b + '}';
    }
    
    public Fraction add(Fraction another){
        return new Fraction(a*another.b + another.a*b,b*another.b);
    }
    
    public Fraction multiply(Fraction another){
        return new Fraction(a*another.a ,b*another.b);
    }

    @Override
    public boolean equals(Object o) {
        Fraction  another = (Fraction)o;
        return (a==another.a) && (b==another.b); 
    }

    @Override
    public int compareTo(Fraction t) {
        return a*t.b - b*t.a;
    }
    
    
    
}
