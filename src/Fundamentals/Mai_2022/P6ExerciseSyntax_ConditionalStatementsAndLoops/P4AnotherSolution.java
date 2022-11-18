package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P4AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        int sum = 0;

        int number = startNum;

        while (number <= endNum){
            System.out.print(number + " ");
            sum += number;
            number++;
        }
        System.out.printf("\nSum: %d", sum);
        //System.out.printf("%nSum: %d", sum);
    }
}
