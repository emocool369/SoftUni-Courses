package Basics.L09ForCicle.Lab;
import java.util.Scanner;

public class P03Numbers1_NwithStep3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i += 3){
        System.out.println(i);}
    }
}
