package Fundamentals.September_2022.P11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P3SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String inputLine = scan.nextLine();
        // String[] inputArray = inputLine.split(" ");

       /* String[] inputArray = scan.nextLine().split(" ");

        int[] numsArray = new int[inputArray.length];

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = Integer.parseInt(inputArray[i]); */

        int[] numbersArray = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int eveSum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            int currentElement = numbersArray[i];
            if (currentElement % 2 == 0) {
                eveSum += currentElement;
            }
        }

        for (int item: numbersArray) {
            if(item % 2 == 0){
                eveSum += item;
            }
        }
        for (int item: numbersArray) {
            System.out.println(item + " "); //принтира всеки елемент в масива
        }
        System.out.println(eveSum);
    }
}
