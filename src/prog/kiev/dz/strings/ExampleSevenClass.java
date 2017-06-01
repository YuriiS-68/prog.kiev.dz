package prog.kiev.dz.strings;

import java.util.Arrays;

/**
 * Created by Skorodielov on 01.06.2017.
 */
public class ExampleSevenClass {
    public static void main(String[] args) {

        String str = "2347865238";
        int result = 1;
        for (int i = 0; i < str.length() - 1; i += 2) {
            String sub = str.substring(i, i+2);
            int val = Integer.parseInt(sub);
            result *= val;
            System.out.print(result+" ");
        }
        System.out.println();
        System.out.println("Итого: - "+result);
    }
}
