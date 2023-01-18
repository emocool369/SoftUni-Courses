package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class returnMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println(readFullName(scan));
    }
    public static String readFullName(Scanner sc){
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        return firstName + " " + lastName;
    }
}
