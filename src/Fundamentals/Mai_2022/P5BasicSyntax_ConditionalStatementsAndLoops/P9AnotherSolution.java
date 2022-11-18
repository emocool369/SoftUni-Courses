package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P9AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;

        }
        System.out.printf("Sum: %d", sum);
    }
}
