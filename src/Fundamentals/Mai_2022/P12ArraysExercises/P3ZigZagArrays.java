package Fundamentals.Mai_2022.P12ArraysExercises;
import java.util.Arrays;
import java.util.Scanner;
public class P3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
           int[] array = new int[2];
           array[0] = scan.nextInt();
           array[1] = scan.nextInt();


           if (i % 2 == 0){
               firstArray[i] = array[0];
               secondArray[i]= array[1];
           } else {
               firstArray[i] = array[1];
               secondArray[i] = array[0];
           }

        }
        System.out.println(Arrays.toString(firstArray).replace("[", "").replace(",", "").replace("]",""));
        System.out.println(Arrays.toString(secondArray).replace("[", "").replace(",", "").replace("]",""));

    }
}
