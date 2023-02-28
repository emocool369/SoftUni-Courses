package Fundamentals.January_2023.P11Arrays;

import java.util.Scanner;

public class P2PrintNumbersInReverseOrder {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numberNumbers = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[numberNumbers];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        for (int j = numbers.length - 1; j >= 0 ; j--) {
            System.out.print(numbers[j] + " ");
        }


    }
}
