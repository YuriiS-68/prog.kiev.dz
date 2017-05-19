import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Skorodielov on 19.05.2017.
 */
public class MassiveSixExampleClass {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int[] sum;

            int [][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Введите элемент array["+i+"]["+j+"]: ");
                array[i][j] = in.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(array));

        for (int i = 0; i < 4; i++) {
            if (i%2 == 0){
                sum  array[i];
            }
        }

    }
}
