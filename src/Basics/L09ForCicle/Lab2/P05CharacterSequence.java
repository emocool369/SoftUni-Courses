package Basics.L09ForCicle.Lab2;
import java.util.Scanner;
public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int len = text.length();

         for (int i = 0; i < len; i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }

    }
}
