package Basics.L11WhileCicle;
import java.util.Scanner;
public class P08Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int year = 1; //започваме от 1 клас
        double sumGrade = 0;
        int poorGradeCount = 0;

        while (year <= 12) {
            if (poorGradeCount > 1) {
                break;
            }
            double grade = Double.parseDouble(scan.nextLine());

            if (grade < 4) {
                poorGradeCount++; //poorGradeCounter = poorGradeCounter + 1;
                continue; //прекъсване изпълнението на текущата итерация, това, което е по-надолу не се изпълнява, а се повтаря цикълът отгоре
            }

            sumGrade = sumGrade + grade;

            year++; // year = year + 1;

        }

        if (poorGradeCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {

            double avgGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}