package Fundamentals.Mai_2022.P9DataTypesAndVariablesExercise;
import java.util.Scanner;
public class P9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int extractedSpice = Integer.parseInt(scan.nextLine());
        int restAfterConsumption = 0;
        int days = 0;
        int sum = 0;

        while (extractedSpice >= 100){

            restAfterConsumption = extractedSpice - 26;
            days +=1;
            extractedSpice = extractedSpice - 10;
            sum = sum + restAfterConsumption;

        }
        System.out.println(days);
        if (sum > 0){
            sum = sum - 26;}
        else {
            sum = sum;
        }
        System.out.println(sum);

    }
}
