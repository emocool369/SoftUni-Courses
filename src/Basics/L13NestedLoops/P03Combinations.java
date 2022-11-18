package Basics.L13NestedLoops;
import java.util.Scanner;
public class P03Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int combinations = 0;

        int allCombinations = 0;

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n; j++){
                for (int k = 0; k <= n; k++){
                    allCombinations++;
                    int product = i +j + k;



                    if (product == n){
                        combinations +=1;
                    }


                }
            }

        }
        System.out.println(allCombinations);
        System.out.println(combinations);
    }
}
