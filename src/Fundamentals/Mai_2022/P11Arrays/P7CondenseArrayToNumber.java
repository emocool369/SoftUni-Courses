package Fundamentals.Mai_2022.P11Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class P7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//        if (numbers.length == 1) {
//            System.out.printf("%d is already condensed to number", numbers[0]);
//            return;
//        }
        while (numbers.length > 1) {
            int[] sum = new int[numbers.length - 1];
            for (int i = 0; i < sum.length; i++) {
                sum[i] = numbers[i] + numbers[i + 1];
            }
            numbers = sum;
        }


            System.out.println(numbers[0]);
        }
    }

