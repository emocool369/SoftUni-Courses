package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P9SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= num * 2; i++) {

            if (i % 2 != 0){
                System.out.println(i);
                sum += i;
            }

        }
        System.out.printf("Sum: %d", sum);

    }
}
