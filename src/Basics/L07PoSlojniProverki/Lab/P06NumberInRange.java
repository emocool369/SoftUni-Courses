package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P06NumberInRange {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num >= - 100 && num <= 100 && num != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
