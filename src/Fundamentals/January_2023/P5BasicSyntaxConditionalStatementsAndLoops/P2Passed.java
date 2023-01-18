package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P2Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scan.next());

        if(inputGrade >= 3.00){
            System.out.println("Passed!");
        }
    }
}
