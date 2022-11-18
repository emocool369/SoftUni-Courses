package Basics.L09ForCicle.Lab2;
import java.util.Scanner;
public class P02NumbersN_1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int num = Integer.parseInt(scan.nextLine());

        for (int i = num; i >= 1; i--){
            System.out.println(i);
            System.out.printf("%02d%n", i);


        }

        for (int i = num; i >= 1; i--){
            System.out.printf("%02d%n", i);


        }

    }
}
