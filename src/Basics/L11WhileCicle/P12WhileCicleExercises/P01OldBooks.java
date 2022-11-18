package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String favoriteBook = scan.nextLine();
        int count = 0;
        String nextBook = scan.nextLine();

        while (!(nextBook.equals("No More Books"))){
            if (favoriteBook.equals(nextBook)){
                break;
            }
            count++;
            nextBook = scan.nextLine();

        }
        if (nextBook.equals(favoriteBook)){
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
