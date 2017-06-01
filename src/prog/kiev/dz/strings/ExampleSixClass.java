package prog.kiev.dz.strings;

import java.util.Arrays;

/**
 * Created by Skorodielov on 01.06.2017.
 */
public class ExampleSixClass {
    public static void main(String[] args) {

        String str = "The Java programming language is a general-purpose, concurrent, class-based, object-oriented language.";
        String strAfter = str.replaceAll("[^a-z^A-Z]", " ");

        String[] array = strAfter.split(",");
        System.out.println(Arrays.toString(array));
    }
}
