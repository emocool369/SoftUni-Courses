package Basics.L09ForCicle.Lab2;
import java.util.Scanner;
public class P04EvenPowersOf2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i += 2){
            System.out.println(num);

            num = num * 2 * 2;
        }

    }
}
