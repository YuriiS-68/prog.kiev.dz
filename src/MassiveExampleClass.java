/**
 * Created by Skorodielov on 18.05.2017.
 */
public class MassiveExampleClass {
    public static void main(String[] args) {
        byte[] mass = {23, 5, 67, 18,-4, 99};

        byte massMax = mass[0];
        byte massMin = mass[0];
        for (byte i = 0; i < mass.length; i++) {
            if (mass[i] > massMax) {
                massMax = mass[i];
            }
            if (massMin > mass[i]){
                massMin = mass[i];
            }
        }
        System.out.println("Максимальное значение в массиве :" + massMax);
        System.out.println("Минимальное значение в массиве :" + massMin);
    }
}
