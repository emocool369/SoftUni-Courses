package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P5Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String reverse = "";
        String password = "";
        int n = 1;

        for (int i = username.length() - 1; i >= 0 ; i--) {
            reverse = reverse + username.charAt(i);

            //char currentSymbol = username.charAt(i);
            //reverse += currentSymbol;
        }

        while (n <= 4){
            password = scan.nextLine();
            n += 1;

            if (password.equals(reverse)){
                System.out.printf("User %s logged in.", username);
                break;
            } else if (n <= 4) {
                System.out.println("Incorrect password. Try again.");
            }


        }

        if (n == 5 && !password.equals(reverse)){
            System.out.printf("User %s blocked!", username);
        }

    }
}
