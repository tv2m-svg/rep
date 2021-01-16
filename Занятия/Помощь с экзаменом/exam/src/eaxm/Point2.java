
package eaxm;

public class Point2 {
    
    private double x;
    private double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    double distance (Point2 p2){
        double dist;
        dist = Math.sqrt(Math.pow((p2.x - this.x),2)+Math.pow((p2.y - this.y),2));
        return dist;
    }

    @Override
    public String toString() {
        return "Point2{" + "x=" + x + ", y=" + y + '}';
    }

    
    
    
}

