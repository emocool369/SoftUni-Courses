package Fundamentals.September_2022.P11Arrays.Arrays2;
import java.util.Arrays;
import java.util.Scanner;
public class P6EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int index = 0;
        boolean isIdentical = true;
        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] != secondArray[i]) {
                isIdentical = false;
                index = i;
                break;
            } else {
                sum += firstArray[i];
            }

        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
