package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P06Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());

        int totalPieces = lenght * width;
        String input = scan.nextLine();

        while (!input.equals("STOP")){
            int currentPieces = Integer.parseInt(input);
            totalPieces = totalPieces - currentPieces;
            if (totalPieces <= 0){
                break;
            }


            input = scan.nextLine();
        }
        if (totalPieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        } else {
            System.out.printf("%d pieces are left.", totalPieces);
        }
    }

}
