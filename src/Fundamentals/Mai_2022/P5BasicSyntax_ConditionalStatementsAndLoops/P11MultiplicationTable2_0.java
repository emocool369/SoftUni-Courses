package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P11MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());


        if (n2 > 10){
            System.out.printf("%d X %d = %d", n1, n2, n1 * n2);
        } else {
            for (int i = n2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n1, i, n1 * i);
            }
        }

    }
}
