package Fundamentals.September_2022.P11Arrays.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class P7AnotherTry {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {

            if (array.length == 1) {
                break;
            }
            if (i == condensed.length) {
                int[] newCondensed = new int[condensed.length - 1];
                i = -1;
                array = condensed;
                condensed = newCondensed;
            } else {
                condensed[i] = array[i] + array[i + 1];
            }
        }
        System.out.println(array[0]);
    }
}