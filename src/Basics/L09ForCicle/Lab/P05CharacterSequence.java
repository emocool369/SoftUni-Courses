package Basics.L09ForCicle.Lab;
import java.util.Scanner;
public class P05CharacterSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int len = word.length();

        for (int i = 0; i < len; i++) {
            char symbol = word.charAt(i);
            System.out.println(symbol);
        }

    }
}
