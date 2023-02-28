package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P4LongestIncreasingSubsequenceLIS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLengthSubsequence = 0;
        int lastIndex = 0;

        int[] lengthSubsequence = new int[numbers.length];
        int[] leftSubsequence = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            lengthSubsequence[i] = 1;
            leftSubsequence[i] = -1;

            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && lengthSubsequence[j] + 1 > lengthSubsequence[i]) {
                    lengthSubsequence[i] = lengthSubsequence[j] + 1;
                    leftSubsequence[i] = j;
                }
            }
            if (lengthSubsequence[i] > maxLengthSubsequence) {
                maxLengthSubsequence = lengthSubsequence[i];
                lastIndex = i;
            }
        }

        int[] result = new int[maxLengthSubsequence];
        int currentIndex = maxLengthSubsequence - 1;

        while (lastIndex != -1) {
            result[currentIndex] = numbers[lastIndex];
            currentIndex--;
            lastIndex = leftSubsequence[lastIndex];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

