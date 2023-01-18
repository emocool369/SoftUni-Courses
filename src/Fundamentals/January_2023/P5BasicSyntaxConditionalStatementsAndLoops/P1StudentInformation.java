package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;
import java.util.*;
public class P1StudentInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());

        String output = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        System.out.println(output);

    }

}
