package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P6CharToString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);
        char thirdSymbol = scan.nextLine().charAt(0);

        //System.out.println("" + firstSymbol + secondSymbol + thirdSymbol);
        System.out.printf("%c%c%c", firstSymbol, secondSymbol, thirdSymbol);

    }
}
