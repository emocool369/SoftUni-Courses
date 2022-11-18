package Basics.L09ForCicle.Lab2;
import java.util.Scanner;
public class P01AnotherExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++){
            System.out.println(num + i);
        }
    }
}
