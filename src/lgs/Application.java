package lgs;

public class Application {
    public static void main(String[] args) {
       // 1
        long a = 8L;
        double b = 45.5;
        boolean c = true;
        char symbol = '\u2164';

        // 2
        System.out.println("Byte.MIN    = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX    = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN   = " + Short.MIN_VALUE);
        System.out.println("Short.MAX   = " + Short.MAX_VALUE);
        System.out.println("Integer.MIN = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN    = " + Long.MIN_VALUE);
        System.out.println("Long.MAX    = " + Long.MAX_VALUE);
        System.out.println("Float.MIN   = " + Float.MIN_VALUE);
        System.out.println("Float.MAX   = " + Float.MAX_VALUE);
        System.out.println("Double.MIN  = " + Double.MIN_VALUE);
        System.out.println("Double.MAX  = " + Double.MAX_VALUE);

        // 3
        int array1 [] = {13, 5, 555, 46, 12, 4, 7, 44446, 87, 9};
        int min = array1[0];
        int max = array1[0];
        for (int i = 1; i < array1.length; i++){
            if (array1[i] < min){
                min = array1[i];
            }
            if (array1[i] > max){
                max = array1[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
