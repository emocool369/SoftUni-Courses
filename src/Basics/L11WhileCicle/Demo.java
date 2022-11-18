package Basics.L11WhileCicle;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 5;
        int b = 5;

        while (true) {

            if (a > 10) {
                break;
            }

            System.out.println("a = " + a);
            a++;
        }
        System.out.println();
        while (true) {
            b++;
            if (b > 10) {
                break;
            }

            System.out.println("b = " + b);

        }

        String input = scan.nextLine();

        while (!input.equals("Stop")){
            System.out.println("Emo");
            input = scan.nextLine();
        }
        String input2 = scan.nextLine();

        while (true){
            if(input2.equals("Stop2")){
                break;
            }
            System.out.println("Emo2");
            input2 = scan.nextLine();
        }

    }
}
