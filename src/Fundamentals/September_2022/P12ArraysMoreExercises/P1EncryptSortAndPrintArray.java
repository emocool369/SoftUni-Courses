package Fundamentals.September_2022.P12ArraysMoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P1EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        int[] sums = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            char[] characters = name.toCharArray();

            for (int j = 0; j < characters.length; j++) {
                char character = characters[j];
                int nameLength = name.length();

                switch (character) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        sum += character * nameLength;
                        break;
                    default:
                        sum += character / nameLength;
                        break;
                }
            }
            sums[i] = sum;
            if(i == n-1){
                break;
            } else {
                name = scan.nextLine();
            }
        }

        Arrays.sort(sums);
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
            //for (int print: sums){
            //System.out.println(print);
        }
    }
}

