package Basics.L11WhileCicle;
import java.util.Scanner;
public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < num) {
            // if (sum <= num){
            //break;
            //}
            int currentNum = Integer.parseInt(scan.nextLine());

            sum = sum + currentNum; // sum += currentNum;


        }
        System.out.println(sum);
    }
}
