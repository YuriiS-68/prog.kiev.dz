package prog.kiev.dz.strings;

/**
 * Created by Skorodielov on 30.05.2017.
 */
public class ExampleFiveClass {

    public static void task1() {
        String str = "The Java programming language is strongly and statically typed";
        int count = 0;
        int symbol = str.length();
        for (int i = 0; i < symbol; i++) {
            if (str.charAt(i) != 'a'){
                continue;
            }
            count++;
        }
        System.out.println("Символ a повторяется "+count+" раз.");
    }

    public static void task2(){

        String example = "test";
        StringBuilder sb = new StringBuilder();
        int[] array = new int[example.length()];
        for (int i = 1; i < array.length; i+=2) {
            sb.append(example.charAt(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        task1();
        task2();
    }
}
