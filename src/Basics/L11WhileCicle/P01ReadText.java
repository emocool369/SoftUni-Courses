package Basics.L11WhileCicle;
import java.util.Scanner;
public class P01ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while(!input.equals("Stop")){

            System.out.println(input);
            input = scan.nextLine();
        }

    }
}
