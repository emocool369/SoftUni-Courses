package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P10AnotherSolutionWithMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int number = 0; number <= n ; number++) {

            if(isSumDigitsDivisibleBy8(number) && isContainsOddDigit(number)){
                System.out.println(number);
            }
        }
    }

    private static boolean isSumDigitsDivisibleBy8 (int number){
        int sumDigits = 0;
        while(number >0){
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number = number / 10;
        }
        return sumDigits % 8 == 0; //true, ако се дели на 8
    }

    private static boolean isContainsOddDigit (int number){
        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1){
                return true;
            }
            number /= 10;
        }
        return false;
    }

}
