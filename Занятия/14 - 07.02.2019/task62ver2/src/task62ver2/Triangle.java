package task62ver2;

public class Triangle {
    public static String getType(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b){
            return "Not triangle";
        }
        if (a==b && a==c){
            return "equilateral";
        }
        if (a==b || a==c || b==c){
            return "isosceles";
        }
        return "versatile";  
    }
}
