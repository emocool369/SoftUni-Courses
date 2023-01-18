package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Arrays;
import java.util.Scanner;
public class P7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] integers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[integers.length - 1];

        for (int i = 0; i < integers.length; i++) {
            if(integers.length == 1){
                break;
            }
            if(i == integers.length - 1){
                int[] condensedNew = new int[newArray.length - 1];
                i = -1;
                integers = newArray;
                newArray = condensedNew;

            } else {
                newArray[i] = integers[i] + integers[i + 1];
            }
        }
        System.out.println(integers[0]);
    }
}
