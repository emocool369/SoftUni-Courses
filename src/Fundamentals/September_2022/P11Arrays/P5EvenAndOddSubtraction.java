package Fundamentals.September_2022.P11Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class P5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int item : numbersArray) {
            if (item % 2 == 0){
                evenSum += item;
            } else {
                oddSum += item;
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
