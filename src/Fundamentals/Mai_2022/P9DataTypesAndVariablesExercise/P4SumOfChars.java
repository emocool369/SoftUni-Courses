package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P4SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char c = scan.nextLine().charAt(0);

            //int asciiCode = (int) c;
            //sum += asciiCode;
            //sum += (int) c;

            //int ascii = c; how to get ascii value of character
            //int castAscii = (int) c;  - alternative

            sum += c;
        }
        System.out.println("The sum equals: " + sum);
    }
}
