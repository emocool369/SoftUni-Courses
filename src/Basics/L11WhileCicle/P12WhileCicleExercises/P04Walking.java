package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P04Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int totalStepsPerDay = 0;

        while (totalStepsPerDay <= goal) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                int wayHome = Integer.parseInt(scan.nextLine());
                totalStepsPerDay = totalStepsPerDay + wayHome;
                break;
            } else {
                int current = Integer.parseInt(input);
                totalStepsPerDay = totalStepsPerDay + current;
            }
        }
            if (totalStepsPerDay >= goal){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", totalStepsPerDay - goal);

            } else {
                System.out.printf("%d more steps to reach goal.", goal - totalStepsPerDay);
            }
    }
}
