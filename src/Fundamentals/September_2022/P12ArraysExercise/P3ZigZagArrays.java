package Fundamentals.September_2022.P12ArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {

            int[] numbers = new int[2];
            numbers[0] = scan.nextInt();
            numbers[1] = scan.nextInt();


            if (i % 2 == 0){
                firstArray[i] = numbers[0];
                secondArray[i] = numbers[1];
            } else {
                firstArray[i] = numbers[1];
                secondArray[i] = numbers[0];
            }

        }

        System.out.println(Arrays.toString(firstArray).replace("[", "").replace(",", "").replace("]",""));
        System.out.println(Arrays.toString(secondArray).replace("[", "").replace(",", "").replace("]",""));
    }
}
