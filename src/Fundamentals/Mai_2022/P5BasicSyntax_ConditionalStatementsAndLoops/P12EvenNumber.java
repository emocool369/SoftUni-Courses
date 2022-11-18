package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




            int n = Integer.parseInt(scan.nextLine());

            while (n % 2 != 0) {
                System.out.println("Please write an even number.");
                n = scan.nextInt();
            }
                System.out.printf("The number is: %d%n", Math.abs(n));
            }
        }


