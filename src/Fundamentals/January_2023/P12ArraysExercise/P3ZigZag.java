package Fundamentals.January_2023.P12ArraysExercise;

import java.util.Scanner;

public class P3ZigZag {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            String[] doubleNumber = scan.nextLine().split(" ");
            if(i % 2 != 0){
                firstArray[i] = Integer.parseInt(doubleNumber[1]);
                secondArray[i] = Integer.parseInt(doubleNumber[0]);
            }else{
                firstArray[i] = Integer.parseInt(doubleNumber[0]);
                secondArray[i] = Integer.parseInt(doubleNumber[1]);
            }
        }
        for(int number : firstArray){
            System.out.print(number + " ");
        }
        System.out.println();
        for(int number : secondArray){
            System.out.print(number + " ");
        }
    }
}
