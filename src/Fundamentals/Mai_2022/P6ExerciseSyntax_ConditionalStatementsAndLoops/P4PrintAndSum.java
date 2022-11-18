package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P4PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = startNum; i <= endNum ; i++) {
            System.out.print(i + " ");

            sum +=i;
        }
        //System.out.printf("%nSum: %d", sum);
        System.out.println();
        System.out.printf("Sum: %d", sum);
        //System.out.println("Sum: " + sum);
    }
}
