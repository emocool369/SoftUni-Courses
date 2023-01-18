package Fundamentals.September_2022.P11Arrays;

import java.util.Scanner;

public class P4AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArray = scan.nextLine().split(" ");
        String[] reversedArray = new String[inputArray.length];

        for (int i=inputArray.length-1;i>=0;i--){
        reversedArray[inputArray.length-i-1] = inputArray[i];


        }
        System.out.println(String.join(" ", reversedArray));
    }
}


