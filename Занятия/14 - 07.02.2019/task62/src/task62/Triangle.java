package task62;

public class Triangle {

    private int a, b, c;

    public Triangle(int a, int b, int c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b){
            throw new IllegalArgumentException("Not triangle");
        }                
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    public String getType(){
        if (a==b && a==c){
            return "equilateral";
        }
        if (a==b || a==c || b==c){
            return "isosceles";
        }
        return "versatile";    
    }
}
