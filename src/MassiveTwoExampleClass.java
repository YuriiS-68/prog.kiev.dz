import java.util.Random;

/**
 * Created by Skorodielov on 18.05.2017.
 */
public class MassiveTwoExampleClass {
    public static void main(String[] args) {
        int [] array = new int[10];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            sum += array[i];
        }
        System.out.println(array[0]+" , "+array[9]);
        System.out.println((array[0] + array[9])/2);
        System.out.println(sum);

    }
}
