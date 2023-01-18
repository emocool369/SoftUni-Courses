package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P6TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (char letter1 = 0; letter1 < n; letter1++) {
            for (char letter2 = 0; letter2 < n; letter2++) {
                for (char letter3 = 0; letter3 < n; letter3++) {

//                    for (char letter1 = 'a'; letter1 < 'a' + n; letter1++) {
//                        for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
//                            for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    //System.out.printf("%c%c%c%n", letter1, letter2, letter3);

                    char firstChar = (char) ('a' + letter1);
                    char secondChar = (char) ('a' + letter2);
                    char thirdChar = (char) ('a' + letter3);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }

            }

        }

    }
}
