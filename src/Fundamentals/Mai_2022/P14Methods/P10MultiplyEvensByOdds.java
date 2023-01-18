package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        number = Math.abs(number);


        System.out.println(multiplyEvensAndOdds(number));


    }

    public static int multiplyEvensAndOdds (int number){
        int evens = evens(number);
        int odds = odds(number);
        return evens * odds;
    }

    public static int evens (int number){
        int result = 0;
        int digit = 0;
        for (int i = number; number > 0; i++) {
            digit = number % 10;

            if (digit % 2 == 0){
                result += digit;
            }

            number = number / 10;

        }



        return result;
    }

    public static int odds (int number){
        int result = 0;
        int digit = 0;
        for (int i = number; number > 0 ; i++) {
            digit = number % 10;

            if (digit % 2 == 1){
                result += digit;
            }
            number = number/ 10;
        }
        return result;
    }
}
