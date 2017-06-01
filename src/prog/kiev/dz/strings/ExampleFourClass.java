package prog.kiev.dz.strings;

import java.util.Arrays;

/**
 * Created by Skorodielov on 24.05.2017.
 */
public class ExampleFourClass {
    public static void main(String[] args) {

        String str = "The Java programming language is a relatively high-level language, in that details of the machine representation are not available through the language.";
        StringBuilder sb = new StringBuilder();
        String [] result = str.split(" ");
        for (String s : result) {
            sb.append(s.charAt(0));
        }
        System.out.println(sb);
    }
}
