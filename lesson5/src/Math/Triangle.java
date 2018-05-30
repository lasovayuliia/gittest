package Math;

public class Triangle {

    //right triangle square calculation
    public static double rightSquare(double a, double b) {
        return (0.5 * a * b);
    }

    //right triangle perimeter calculation
    public static double rightPerimeter(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return (a + b + c);
    }

}
