package Basics.L09ForCicle.Lab;
import java.util.Scanner;
public class P07SumNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++){
            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
