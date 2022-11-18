package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P12AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        while(true){
            if(n % 2 == 0) {
                System.out.println("The number is: " + Math.abs(n));
                break;
            }
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scan.nextLine());
        }
    }
}
