import java.util.Arrays;

/**
 * Created by Skorodielov on 19.05.2017.
 */
public class MassiveFourExampleClass {
    public static void main(String[] args) {
        char [] array = new char[16];
        array[0] = 'd';
        array[1] = 'f';
        array[2] = 'n';
        array[3] = 'a';
        array[4] = 'o';
        array[5] = 'b';
        array[6] = 'c';
        array[7] = 'c';
        array[8] = 'c';
        array[9] = 'c';
        array[10] = 'n';
        array[11] = 'd';
        array[12] = 'a';
        array[13] = 'c';
        array[14] = 'b';
        array[15] = 'c';

        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        String str = new String();
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        //System.out.println(str);

        String str2 = str.substring(8);
        //System.out.println(str2.toUpperCase());

        int hCode = str2.hashCode();
        System.out.println(hCode);

        String str3 = str2.replace('c','p');
        //System.out.println(str3.toUpperCase());

    }
}
