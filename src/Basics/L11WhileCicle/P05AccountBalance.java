package Basics.L11WhileCicle;
import java.util.Scanner;
public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0;

        // double amount = 0.0;

        while(!input.equals("NoMoreMoney") && !input.equals("Stop")){ //while(!input.equals("NoMoreMoney") && amount > 0)
            double amount = Double.parseDouble(input);
            if (amount < 0){
                System.out.println("Invalid operation!");
                break;
            }

            sum = sum + amount;
            System.out.printf("Increase: %.2f%n", amount);
            input = scan.nextLine();


        }

        System.out.printf("Total: %.2f", sum);
    }
}
