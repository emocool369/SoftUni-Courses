package Fundamentals.September_2022.P12ArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P8MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scan.nextLine());

        int index = 0;
            for (int element: array) {
                index ++;

                for (int i = index; i < array.length; i++) {
                if(element + array[i] == n){
                    System.out.println(element + " " + array[i]);
                }
            }

        }

    }
}
