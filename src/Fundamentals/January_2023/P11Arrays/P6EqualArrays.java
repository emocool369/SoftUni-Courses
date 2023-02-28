package Fundamentals.January_2023.P11Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualArrays {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int index = -1;
        int sum = 0;
        boolean isIdentical = true;

        if(firstArray.length != secondArray.length){
            System.out.println("Arrays are not identical.");
        }else{
            for (int i = 0; i < firstArray.length; i++) {
                int firstEl = firstArray[i];
                int secondEl = secondArray[i];

                if(firstEl == secondEl){
                    sum += firstEl;
                }else{
                    index = i;
                    isIdentical = false;
                    break;
                }

            }
        }

        if (isIdentical){
            System.out.println("Arrays are identical. Sum: " + sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }


    }
}
