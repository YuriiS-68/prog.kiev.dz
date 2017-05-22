package prog.kiev.dz.one;

/**
 * Created by Skorodielov on 22.05.2017.
 */
public class TriangleClass {
    public static void main(String[] args) {

        System.out.printf("Площадь треугольника %.2f ", geronSquare(4, 5, 6));
    }

    public static double geronSquare(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
