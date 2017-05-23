package prog.kiev.dz.strings;

/**
 * Created by Skorodielov on 23.05.2017.
 */
public class ExampleTwoClass {
    public static void main(String[] args) {
        String str = "oiohejbcugwbkehgflshbdccygv";
        System.out.println("Количество символов в строке :"+str.length());
        System.out.println(str.toUpperCase());

        String str1 = "knbds";
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.codePointAt(i));
            sum += str1.codePointAt(i);
        }
        System.out.println("Итого: "+sum);
    }
}
