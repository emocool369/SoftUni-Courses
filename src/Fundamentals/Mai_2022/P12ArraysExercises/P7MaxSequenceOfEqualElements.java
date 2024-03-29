package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Scanner;
import java.util.Arrays;
public class P7MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers[] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < numbers.length ; i++) {

            if (numbers[i] == numbers[i - 1]){
                counter++;


            if (counter > maxCount) {
                maxCount = counter;
                digit = numbers[i];
            }
            }else {
                counter = 1;
            }
            }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }

    }

}
