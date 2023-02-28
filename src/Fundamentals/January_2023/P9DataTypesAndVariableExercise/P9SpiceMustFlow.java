package Fundamentals.January_2023.P9DataTypesAndVariableExercise;

import java.util.Scanner;

public class P9SpiceMustFlow {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int startingYieldOfTheSource = Integer.parseInt(scan.nextLine());
        int numberDays = 0;
        int minedPerDay = 0;
        int totalMined = 0;

        while (startingYieldOfTheSource >= 100){

            minedPerDay = startingYieldOfTheSource - 26;
            numberDays++;


            startingYieldOfTheSource = startingYieldOfTheSource -10;


            totalMined += minedPerDay;

        }
        System.out.println(numberDays);

        if (totalMined > 0){
            totalMined = totalMined - 26;}
        else {
            totalMined = totalMined;
        }
        System.out.println(totalMined);
    }
}
