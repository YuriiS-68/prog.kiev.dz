package prog.kiev.dz.strings;

import java.util.Arrays;

/**
 * Created by Skorodielov on 01.06.2017.
 */
public class ExampleSevenClass {

    public static void multiplicaitionOne(){

        String str = "2347865238";
        int result = 1;
        for (int i = 0; i < str.length() - 1; i += 2) {
            int number = (str.charAt(i) - '0') * 10 + (str.charAt(i + 1) - '0');
            result *= number;
            System.out.print(result+" ");
        }
        System.out.println();
        System.out.println("Итого: - "+result);
    }

    public static void multiplicaitionTwo(){

        String str = "2347865238";
        int result = 1;
        for (int i = 0; i < str.length() - 1; i += 2) {
            String sub = str.substring(i, i + 2);
            int value = Integer.parseInt(sub);
            result *= value;
            System.out.print(result+" ");
        }
        System.out.println();
        System.out.println("Итого: - "+result);
    }
    public static void main(String[] args) {

        multiplicaitionOne();
        multiplicaitionTwo();
    }
}
