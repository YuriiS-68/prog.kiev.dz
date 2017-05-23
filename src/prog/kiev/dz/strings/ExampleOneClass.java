package prog.kiev.dz.strings;

import java.util.Scanner;

/**
 * Created by Skorodielov on 23.05.2017.
 */
public class ExampleOneClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = sc.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = sc.nextLine();
        String result = str1.concat(str2).concat(str3);

        System.out.println(result);
    }
}
