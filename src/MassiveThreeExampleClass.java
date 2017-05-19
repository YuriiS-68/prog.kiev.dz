import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created by Skorodielov on 18.05.2017.
 */
public class MassiveThreeExampleClass {
    public static void main(String[] args) {
        String [] array = {"java","title","org","peace","world","hello","water","car","camel","baby"};
        String s = "baby"+"camel"+"car"+"water"+"hello"+"world"+"peace"+"org"+"title"+"java";

        String s1 = s.substring(4,39);
        System.out.println(s1);

        String startLit = "s";
        String endLit = "m";
        boolean start = s1.startsWith(startLit);
        boolean end = s1.endsWith(endLit);
        System.out.println("Строка начинается с символа "+startLit +" ? "+"-"+start);
        System.out.println("Строка заканчивается символом "+endLit+" ? "+"-"+end);

        String s2 = s1.toUpperCase();
        System.out.println(s2);
    }
}
