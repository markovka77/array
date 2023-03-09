import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        double[] numWithComa = {1.57, 7.654, 9.986};
        int[] seasons = {1, 2, 3, 4};
        // задача 2
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println(numWithComa[0] + ", " + numWithComa[1] + ", " + numWithComa[2]);
        System.out.println(seasons[0] + ", " + seasons[1] + ", " + seasons[2] + ", " + seasons[3]);
        System.out.println();
        // задача 3
        System.out.println(num[2] + ", " + num[1] + ", " + num[0]);
        System.out.println(numWithComa[2] + ", " + numWithComa[1] + ", " + numWithComa[0]);
        System.out.println(seasons[3] + ", " + seasons[2] + ", " + seasons[1] + ", " + seasons[0]);
        System.out.println();
        // задача 4


    }
}