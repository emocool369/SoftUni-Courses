package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P02AnotherSolution {





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int maxBadGrades = Integer.parseInt(scanner.nextLine());

            int badGrades = 0;
            int countAllGrades = 0;
            int sumGrades = 0;

            String lastEx = "";

            String nameEx = scanner.nextLine();
            while (!(nameEx.equals("Enough"))) {
                int grades = Integer.parseInt(scanner.nextLine());
                countAllGrades++;
                sumGrades += grades;

                if (grades <= 4) {
                    maxBadGrades--;
                    badGrades++;
                }
                if (maxBadGrades == 0) {
                    break;
                }

                lastEx = nameEx;
                nameEx = scanner.nextLine();
            }
            if (maxBadGrades == 0) {
                System.out.printf("You need a break, %d poor grades.", badGrades);
            } else {
                System.out.printf("Average score: %.2f%n", 1.0 * sumGrades / countAllGrades);
                System.out.printf("Number of problems: %d%n", countAllGrades);
                System.out.printf("Last problem: %s", lastEx);
            }
        }
    }