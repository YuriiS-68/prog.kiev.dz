package prog.kiev.dz.one;

import java.util.Scanner;

/**
 * Created by Skorodielov on 22.05.2017.
 */
public class CircleClass {

    static double pi = 3.1415;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 если хотите ввести radius круга или введите 1 если хотите ввести его diametr :");
        short variant = sc.nextShort();
        if (variant == 0){
            System.out.println("Введите radius круга в формате (0.0): ");
            double r = sc.nextDouble();
            System.out.println(areaCircleRadius(r, pi));
        }
        else {
            System.out.println("Введите diametr круга в формате (0.0): ");
            double d = sc.nextDouble();
            System.out.println(areaCircleDiametr(d, pi));
        }

    }

    public static double areaCircleRadius(double r, double pi){
        double areaCircle = (r * r)*pi;
        return areaCircle;
    }

    public static double areaCircleDiametr(double d, double pi){
        double areaCircle = (pi / 4)*(d * d);
        return areaCircle;

    }
}
