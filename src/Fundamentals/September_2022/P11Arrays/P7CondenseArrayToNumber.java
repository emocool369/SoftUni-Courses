package Fundamentals.September_2022.P11Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class P7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensed = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if(nums.length == 1){
                break;
            }
            if(i == nums.length-1){
                int[] condenseNew = new int[condensed.length - 1];
                i = -1;
                nums = condensed;
                condensed = condenseNew;
            } else{
            condensed[i] = nums[i] + nums[i+1];
        }

    }
        System.out.println(nums[0]);
    }
}
