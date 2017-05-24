package prog.kiev.dz.strings;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Skorodielov on 23.05.2017.
 */
public class ExampleThreeClass {
    public static void main(String[] args) {

        int massLenght = 1000000;
        int count = 0;

        String [] massStrok = new String[massLenght];

        for (int i = 0; i < massLenght; i++) {
            char[] str = new char[random(10, 1000)];
            for (int j = 0; j <= str.length; j++) {
                char symbol = (char)((int)randomSymbol(65, 122));
            }
            massStrok[i] = new String(str);
            count += massStrok[i].length();
        }
        System.out.println(count);
    }

    public static int random(int start, int end){
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }

    public static int randomSymbol(int start, int end){
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }
}
