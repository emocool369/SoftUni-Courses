package Fundamentals.Mai_2022.P11Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class P5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int item : numbers){
            if (item % 2 == 0){
                evenSum += item;
            } else {
                oddSum += item;
            }
        }

        System.out.println(evenSum - oddSum);

    }
}
