package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println(theSmallestNumber(num1, num2, num3));

    }

    public static int theSmallestNumber(int num1, int num2, int num3) {
        int smallestNum = 0;
        for (int i = 0; i < 3; i++) {


            if (num1 > num2) {
                smallestNum = num2;
            } else {
                smallestNum = num1;
            }

            if (num3 < smallestNum) {
                smallestNum = num3;
            }

        }
        return smallestNum;
    }
}