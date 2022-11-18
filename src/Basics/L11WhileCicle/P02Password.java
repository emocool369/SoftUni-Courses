package Basics.L11WhileCicle;
import java.util.Scanner;
public class P02Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regUsername = scan.nextLine();
        String regPass = scan.nextLine();

        while(true){
            String pass = scan.nextLine();

            if (pass.equals(regPass)){
                break;
            }
        }

        System.out.printf("Welcome %s!", regUsername);

    }
}
