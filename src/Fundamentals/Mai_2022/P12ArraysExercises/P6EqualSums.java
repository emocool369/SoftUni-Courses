package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Scanner;
import java.util.Arrays;
public class P6EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //правя текста в текстовия масив на числа в масив

        boolean isFound = false; // няма такъв елемент

        for (int index = 0; index < numbers.length; index++) {
            int currentElement = numbers[index];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true; //има такъв елемент
            return; //break;
            }

            }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
