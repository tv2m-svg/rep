package task48;

public class MathLib {

    public static Result QuadraticEquation(double a, double b, double c) {
        double d = Math.pow(b, 2) - (4 * a * c);
        if (d >= 0) {
            return new Result(true,
                    ((-1) * b + Math.sqrt(d)) / 2 * a,
                    ((-1) * b - Math.sqrt(d)) / 2 * a);
        } else {
            return new Result(false, 0.0, 0.0);
        }
    }
}
