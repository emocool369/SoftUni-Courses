package Fundamentals.Mai_2022.P11Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class P6EqualArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//        if (firstArray.length != secondArray.length)

        int sum = 0;
        boolean areNotIdentical = false;
        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];

            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }
        if (!areNotIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
