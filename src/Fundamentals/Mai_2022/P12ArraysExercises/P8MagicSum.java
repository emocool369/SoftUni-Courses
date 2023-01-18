package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Arrays;
import java.util.Scanner;
public class P8MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());
        int index = 0;

        for (int number: numbers) {
        index++;

        for (int i = index; i < numbers.length; i++) {
            int sum = number + numbers[i];

            if (sum == n) {
                System.out.print(number + " ");
                System.out.println(numbers[i]);
            }
        }
        }


    }
}
