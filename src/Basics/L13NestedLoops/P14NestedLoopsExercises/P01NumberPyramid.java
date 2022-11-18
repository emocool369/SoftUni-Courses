package Basics.L13NestedLoops.P14NestedLoopsExercises;
import java.util.Scanner;
public class P01NumberPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int current = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(current + " ");
                current++;

                if (current > n){ //прекъсване вътрешния цикъл
                    break;
                }

            }
            if (current > n){ //прекъсване на външния цикъл
                break;
            }
            System.out.println();
        }


    }
}
