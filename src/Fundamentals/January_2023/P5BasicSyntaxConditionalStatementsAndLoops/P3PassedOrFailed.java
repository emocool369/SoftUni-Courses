package Fundamentals.January_2023.P5BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P3PassedOrFailed {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scan.nextLine());

        if(gradeInput >= 3.00){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
