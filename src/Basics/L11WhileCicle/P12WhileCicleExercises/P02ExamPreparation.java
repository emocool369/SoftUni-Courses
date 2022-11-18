package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberBadNotes = Integer.parseInt(scan.nextLine());
        String text = scan.nextLine();
        int totalScore = 0;
        int numberSolvedTasks = 0;
        int numberNotSolvedTasks = 0;
        int numberTotalTasks = 0;
        String text2 = "";

        while (!text.equals("Enough")) {

            int note = Integer.parseInt(scan.nextLine());

            if (note > 0){
                numberTotalTasks += 1;
            }

            if (note >= 5) {
                numberSolvedTasks += 1;
            }
            if (note <= 4) {
                numberNotSolvedTasks += 1;
            }

            if (numberNotSolvedTasks == numberBadNotes){
                break;
            }
            text2 = text;
            text = scan.nextLine();


            totalScore += note;

        }


        if (text.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", totalScore * 1.0 / numberTotalTasks);
            System.out.printf("Number of problems: %d%n", numberTotalTasks);
            System.out.printf("Last problem: %s", text2);
        } else if (numberNotSolvedTasks == numberBadNotes) {
            System.out.printf("You need a break, %d poor grades.", numberNotSolvedTasks);
        }
    }
}