import java.util.Arrays;
import java.util.Random;

/**
 * Created by Skorodielov on 19.05.2017.
 */
public class MassiveFiveExampleClass {
    public static void main(String[] args) {
        int [] array = new int[20];
        Arrays.fill(array,17);
        System.out.println(Arrays.toString(array));

        Random rand = new Random();
        for (int i = 1; i <= array.length; i+=2) {
           array[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }
}
