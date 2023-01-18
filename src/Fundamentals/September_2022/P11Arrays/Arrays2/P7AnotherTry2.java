package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Arrays;
import java.util.Scanner;
public class P7AnotherTry2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensedArray = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers.length == 1){
                break;
            }

            if(i == condensedArray.length){
                int[] newCondensed = new int[condensedArray.length - 1];
                i = -1;
                numbers = condensedArray;
                condensedArray = newCondensed;
            } else {

                condensedArray[i] = numbers[i] + numbers[i + 1];
            }

        }
        System.out.println(numbers[0]);

    }
}
