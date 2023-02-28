package Fundamentals.January_2023.P12ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P1EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int[] output = new int[1];
        int counter = 0;

        for (int i = 1; i <= numberOfStrings; i++) {
            String name = scan.nextLine();
            sum = 0;

            int stringLength = name.length();

            char[] characters = name.toCharArray();

            for (char char1 : characters) {
                if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u' || char1 == 'A' || char1 == 'E' || char1 == 'I' || char1 == 'O' || char1 == 'U') {
                    int result = char1 * stringLength;
                    sum += result;
                } else {
                    int result = char1 / stringLength;
                    sum += result;
                }
            }
            counter++;

            if (counter == 1) {
                int[] temp = new int[counter];
                temp[0] = sum;
                System.arraycopy(temp, 0, output, 0, output.length);

            }else{
                int[] temp = new int[counter];
                System.arraycopy(output, 0, temp, 1, output.length);
                temp[0] = sum;
                output = temp;

            }


        }

        Arrays.sort(output);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}
