package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P3CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch1 = scan.nextLine().charAt(0);
        char ch2 = scan.nextLine().charAt(0);

        characters(ch1, ch2);
    }

    public static void characters(char c1, char c2) {

        int ascii1 = c1;
        int ascii2 = c2;
        char newChar = 0;

        if (c1 < c2) {
            for (int i = ascii1 + 1; i < ascii2; i++) {
                newChar = (char) i;

                System.out.print(newChar + " ");
            }
        } else {

            for (int i = ascii2 + 1; i < ascii1; i++) {
                newChar = (char) i;

                System.out.print(newChar + " ");
            }
        }
    }
}