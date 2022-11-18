package Basics.L11WhileCicle;
import java.util.Scanner;
public class P01AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            String input = scan.nextLine();

            if(input.equals("Stop")){
                break;
            } //else { - може и без това
                System.out.println(input);
            }
        }
    }

