package Fundamentals.January_2023.P12ArraysExercise;

import java.util.Scanner;

public class P2CommonElements {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");

        if(array1.length > array2.length){
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array2[i].equals(array1[j])){
                    System.out.print(array2[i]+ " ");
                }
            }

        }
        }else if (array1.length < array2.length){
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if(array2[i].equals(array1[j])){
                        System.out.print(array2[i] + " ");
                    }
                }
            }
        }else{
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if(array2[i].equals(array1[j])){
                        System.out.print(array2[i] + " ");
                    }
                }
            }
        }

    }
}
