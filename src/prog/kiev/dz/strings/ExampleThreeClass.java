package prog.kiev.dz.strings;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Skorodielov on 23.05.2017.
 */
public class ExampleThreeClass {
    public static void main(String[] args) {

        Random rnd = new Random();
        int massLenght = 1000000;
        int count = 0;

        String [] massStrok = new String[massLenght];

        for (int i = 0; i < massLenght; i++) {
            StringBuilder str = new StringBuilder();
            int strLenght = random(10, 1000, rnd);
            for (int j = 0; j <= strLenght; j++) {
                char symbol = (char)((int)randomSymbol(65, 122, rnd));
                str.append(symbol);
            }
            massStrok[i] = str.toString();
            count += massStrok[i].length();
        }
        System.out.println(count);
    }

    public static int random(int start, int end, Random rnd){
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }

    public static int randomSymbol(int start, int end, Random rnd){
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }
}
