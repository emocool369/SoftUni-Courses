package Fundamentals.September_2022.P12ArraysExercise;

import java.util.Scanner;

public class P2CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");

        if (firstArray.length > secondArray.length){

            for (int i = 0; i < secondArray.length; i++) {


                for (String element : firstArray) {
                    if (element.equals(secondArray[i])){

                        System.out.print(secondArray[i] + " ");

                    }
                }

            }
        } else {

        for (int i = 0; i < firstArray.length; i++) {


        for (String element : firstArray) {
            if (element.equals(secondArray[i])){

                System.out.print(secondArray[i] + " ");

            }
        }

        }


    }
}}
