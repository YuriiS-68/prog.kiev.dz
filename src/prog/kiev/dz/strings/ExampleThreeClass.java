package prog.kiev.dz.strings;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Skorodielov on 23.05.2017.
 */
public class ExampleThreeClass {
    public static void main(String[] args) {
        Random rnd = new Random();

        final int start = 10;
        final int end = 1000;
        final int rand = random(10, 1000, rnd);
        final int randS = randomSymbol(65, 122, rnd);


        System.out.println((char) randS);

        char [] massStrok = new char[1000000];
        for (char c : massStrok) {
            char[] charStr = new char[rand];
            for (char c1 : charStr) {
                charStr[c1] = (char)randS;
            }
            new String (charStr);
        }
        System.out.println(Arrays.toString(massStrok));


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
