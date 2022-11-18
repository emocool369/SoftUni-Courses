package Basics.L11WhileCicle;
import java.util.Scanner;
public class P02AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regUsername = scan.nextLine();
        String regPass = scan.nextLine();
        String pass = scan.nextLine();

        while (!pass.equals (regPass)){
            pass = scan.nextLine();
        }
        System.out.printf("Welcome %s!", regUsername);
    }
}
