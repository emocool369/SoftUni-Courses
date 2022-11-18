package Basics.L13NestedLoops.P14NestedLoopsEx2;
import java.util.Scanner;
public class P02T03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for (int i = n; i <= m ; i++) {
            int oddSum = 0;
            int evenSum = 0;
            int current = i;

            for (int j = 6; j >= 1 ; j--) {
                int digit = current % 10;
                if (j % 2 == 0){
                    evenSum += digit;
                }else{
                    oddSum += digit;
                }
                current = current / 10;
            }
            if (oddSum == evenSum){
                System.out.println(i + " ");
            }
        }

    }
}
