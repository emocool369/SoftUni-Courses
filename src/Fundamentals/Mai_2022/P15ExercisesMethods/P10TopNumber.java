package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        boolean isDividedByEight = true;
        boolean isOdd = true;
        int sum = 0;
        int counter = 0;
        int currentNum = 0;
        int topInteger = 0;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            currentNum = i;
            topInteger = i;

            int length = String.valueOf(i).length();
            int[] array = new int[length];


            for (int j = 0; j < array.length; j++) {

                int currentDigit = currentNum % 10;
                currentNum = currentNum / 10;

                array[array.length - 1 - j] = currentDigit;

                sum += currentDigit;


            }
            counter = 0;
            for (int k = 0; k < array.length - 1; k++) {
                int currentDigit = array[k];

                if (currentDigit % 2 == 1) {
                    isOdd = true;
                    counter = counter + 1;

                }else{
                    isOdd = false;
                }


                if (sum % 8 == 0) {
                    isDividedByEight = true;
                } else {
                    isDividedByEight = false;
                }


            }
            if(isDividedByEight && counter >= 1){
                System.out.println(topInteger);
        }


        }
    }
}