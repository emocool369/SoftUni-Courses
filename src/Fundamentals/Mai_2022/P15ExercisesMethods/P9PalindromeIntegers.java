package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        boolean isValid = true;

        while (!input.equals("END")){

            if(input.length() == 1){
                System.out.println("true");
                input = scan.nextLine();
            }

            String[] inputString = input.split("");
            int[] array = new int[input.length()];


            for (int i = 0; i < input.length(); i++) {
                array[i] = Integer.parseInt(inputString[i]);
            }



            for (int i = 0; i < input.length() / 2; i++) {



                if(array[i] == array[input.length() - 1 - i]){
                    isValid = true;

                }else{
                    isValid = false;
                }

            }

            if(isValid){
                System.out.println("true");
            } else{
                System.out.println("false");
            }

            input = scan.nextLine();

        }




    }
}

