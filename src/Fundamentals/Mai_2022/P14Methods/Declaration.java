package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class Declaration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        printText(inputText);
    }

    public static void printText (String text){
        for (int i = 0; i < 5; i++) {
            System.out.println(text);

        }
    }
}
