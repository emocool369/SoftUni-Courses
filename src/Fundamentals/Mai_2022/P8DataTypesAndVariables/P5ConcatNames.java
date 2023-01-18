package Fundamentals.Mai_2022.P8DataTypesAndVariables;
import java.util.Scanner;
public class P5ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.println(firstName + delimiter + secondName);
    }
}
