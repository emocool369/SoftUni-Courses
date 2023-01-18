package Fundamentals.Mai_2022.P15ExercisesMethods;
import java.util.Scanner;
public class P6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printMiddle(input);

    }
    public static void printMiddle (String text){

            if (!(text.length() % 2 == 0)){

                char chMiddle = text.charAt(text.length() / 2);

                System.out.println(chMiddle);

            } else {

                char chMiddle1 = text.charAt((text.length() / 2) - 1);
                char chMiddle2 = text.charAt(text.length() / 2);

                System.out.printf("%c%c",chMiddle1,chMiddle2);
                //System.out.println(text.charAt(chMiddle1) + "" + text.charAt(chMiddle2));
            }


        }



}
