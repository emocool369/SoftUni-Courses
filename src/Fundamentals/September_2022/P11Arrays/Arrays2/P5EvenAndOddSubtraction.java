package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Arrays;
import java.util.Scanner;
public class P5EvenAndOddSubtraction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int oodSum = 0;
        int evenSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenSum += numbers[i];
            } else {
                oodSum += numbers[i];
            }

        }
        System.out.println(evenSum - oodSum);

    }

}
