package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P6StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int numOriginal = num;
        int result = 1;
        int finalResult = 0;

        while(num>0){
            int lastDigit = num % 10;
            result = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                result = result * i;

            }
            finalResult = finalResult + result;

            num = num /10;
        }



        if(finalResult == numOriginal){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
