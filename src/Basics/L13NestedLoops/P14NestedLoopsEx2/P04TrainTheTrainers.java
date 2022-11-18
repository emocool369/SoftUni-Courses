package Basics.L13NestedLoops.P14NestedLoopsEx2;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberPeopleInJury = Integer.parseInt(scan.nextLine());
        String presentation = scan.nextLine();

        double allNotes = 0;
        int numberAllNotes = 0;

        while (!presentation.equals("Finish")) {
            String namePresentation = presentation;

            numberAllNotes++;
            double sumNotes = 0;
            double averageNote = 0;

            for (int i = 1; i <= numberPeopleInJury; i++) {
                double note = Double.parseDouble(scan.nextLine());
                sumNotes += note;
            }


            averageNote = sumNotes / numberPeopleInJury;
            allNotes += averageNote;

            System.out.printf("%s - %.2f%n", namePresentation, averageNote);


            presentation = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allNotes / numberAllNotes);
    }
}
