package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d%n", n, i, (n * i));

        }
    }
}
