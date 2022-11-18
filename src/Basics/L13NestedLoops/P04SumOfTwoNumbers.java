package Basics.L13NestedLoops;
import java.util.Scanner;
public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());

        boolean isValidComb = false;
        int countInterations = 0;
        //int validComb = 0;

        for (int i = start; i <= end; i++){
            for (int j = start; j <= end; j++){
                countInterations++;

                int sum = i + j;

                if (sum == magicNum){
                    //validComb++;
                    //if (validComb == 2) {
                        System.out.printf("Combination N:%d ", countInterations);
                        System.out.printf("(%d + %d = %d)", i, j, magicNum);
                    //}
                    isValidComb = true;
                    break;
                }

            }
            if (isValidComb){
                break;
            }
        }
        if (!isValidComb){

        System.out.printf("%d combinations - neither equals %d", countInterations, magicNum);
        }
    }
}
