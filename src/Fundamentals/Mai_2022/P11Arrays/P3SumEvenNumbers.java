package Fundamentals.Mai_2022.P11Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class P3SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int[] num = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
                    if (num[i] % 2 == 0){
                        sum += num[i];
                    }
        }
        System.out.println(sum);
    }
}
