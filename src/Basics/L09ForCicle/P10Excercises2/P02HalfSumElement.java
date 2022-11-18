package Basics.L09ForCicle.P10Excercises2;
import java.util.Scanner;
public class P02HalfSumElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int nMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++){

            int n2 = Integer.parseInt(scan.nextLine());


            if (n2 > nMax){
                nMax = n2;
            }

            sum = sum + n2;

                    }
        if ((sum - nMax) == nMax){
            System.out.println("Yes");
            System.out.printf("Sum = %d", nMax);
        } else {
            System.out.println("No");
            int diff = Math.abs(nMax - (sum - nMax));
            System.out.printf("Diff = %d", diff);
        }

    }
}
