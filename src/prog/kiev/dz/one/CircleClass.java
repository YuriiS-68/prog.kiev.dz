package prog.kiev.dz.one;

import java.util.Scanner;

/**
 * Created by Skorodielov on 22.05.2017.
 */
public class CircleClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 если хотите ввести radius круга или введите 1 если хотите ввести его diametr :");
        short variant = sc.nextShort();
        if (variant == 0){
            System.out.println("Введите radius круга в формате (0,0): ");
            double r = sc.nextDouble();
            System.out.printf("%.2f",areaCircleRadius(r));
        }
        else {
            System.out.println("Введите diametr круга в формате (0,0): ");
            double d = sc.nextDouble();
            System.out.printf("%.2f",areaCircleDiametr(d));
        }
    }

    public static double areaCircleRadius(double r){
        double areaCircle = (r * r)*Math.PI;
        return areaCircle;
    }

    public static double areaCircleDiametr(double d){
        double areaCircle = (Math.PI / 4)*(d * d);
        return areaCircle;

    }
}
