package Basics.L11WhileCicle;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine(); // "100" "50" "Stop"
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum > maxNum) {
                maxNum = currentNum;

            }
            input = scan.nextLine();
        }
        System.out.println(maxNum);
    }
}
