package Fundamentals.January_2023.P12ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P5TopIntegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] newArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] topInteger = new int[1];
        int counter = 0;
        boolean topIntegerIsValid = false;
        int topIntegerNumber = 0;

        for (int i = 0; i < newArray.length; i++) {
            topIntegerNumber = newArray[i];
            topIntegerIsValid = false;
            for (int j = i + 1; j < newArray.length; j++) {

                if (topIntegerNumber > newArray[j]) {
                    topIntegerIsValid = true;
                } else {
                    topIntegerIsValid = false;
                    break;
                }

            }

            if(i == newArray.length - 1){
                topIntegerIsValid = true;
            }

            if (topIntegerIsValid) {
                topInteger[counter] = topIntegerNumber;
                counter++;
                if (counter != newArray.length - 1&& i!= newArray.length-1) {
                    int[] temporaryArr = new int[counter + 1];
                    System.arraycopy(topInteger, 0, temporaryArr, 0, topInteger.length);
                    topInteger = temporaryArr;
                } else {
                    int[] temporaryArr = new int[counter];
                    System.arraycopy(topInteger, 0, temporaryArr, 0, topInteger.length);
                    topInteger = temporaryArr;
                    topInteger[topInteger.length - 1] = newArray[newArray.length-1];
                }

            }

        }
        System.out.println(Arrays.toString(topInteger).replace("[", "").replace(",", "").replace("]",""));
    }
}