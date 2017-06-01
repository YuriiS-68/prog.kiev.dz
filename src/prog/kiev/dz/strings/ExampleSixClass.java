package prog.kiev.dz.strings;

import com.sun.deploy.util.StringUtils;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 * Created by Skorodielov on 01.06.2017.
 */
public class ExampleSixClass {
    public static void main(String[] args) {

        String str = "The Java programming language is a general-purpose, concurrent, class-based, object-oriented language.";
        String strAfter = str.replaceAll("[^a-z^A-Z]", " ");

        StringBuilder sb = new StringBuilder();
        String[] array = strAfter.split(",");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }
}
