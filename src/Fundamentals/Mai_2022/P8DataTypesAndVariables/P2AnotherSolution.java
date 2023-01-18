package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P2AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float pounds = Float.parseFloat(scan.nextLine());

        float dollars = pounds * 1.36f;

        System.out.printf("%.3f", dollars);
    }
}
