package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P10AnotherSolution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= input ; i++) {
            if (isDividedEight(i) && isOdd(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDividedEight (int num) {
        int sum = 0;
        String numberAsString = "" + num;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
            sum += currentDigit;
        }
        return sum % 8 == 0;
    }

    public static boolean isOdd (int num){
        String numberAsString = "" + num;
        for (int i = 0; i < numberAsString.length(); i++) {
            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));

            if(currentDigit % 2 == 1){
                return true;
            }

        }
        return false;
    }

}
