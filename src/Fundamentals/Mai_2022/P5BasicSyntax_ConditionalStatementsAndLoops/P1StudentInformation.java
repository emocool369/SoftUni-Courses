package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P1StudentInformation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());

        String print = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        System.out.println(print);

    }
}
