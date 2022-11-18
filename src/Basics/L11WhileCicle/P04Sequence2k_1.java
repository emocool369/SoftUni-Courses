package Basics.L11WhileCicle;
import java.util.Scanner;
public class P04Sequence2k_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNum = 1;

        while (currentNum <= n){
            System.out.println(currentNum);

            currentNum = currentNum * 2 + 1;
        }
    }
}
