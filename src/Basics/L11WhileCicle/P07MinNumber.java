package Basics.L11WhileCicle;

import java.util.Scanner;



public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine(); // "100" "50" "Stop"
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < minNum) {
                minNum = currentNum;

            }
            input = scan.nextLine();
        }
        System.out.println(minNum);
    }
}
