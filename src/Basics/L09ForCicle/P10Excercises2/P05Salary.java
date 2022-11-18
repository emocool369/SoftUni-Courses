package Basics.L09ForCicle.P10Excercises2;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());


//        int totalSalary = 0;
//        int penalty = 0;

        for (int i = 1; i <= tabs; i++) {

            String websiteName = scan.nextLine();

            switch (websiteName) {
                case "Facebook":
//                    penalty = 150;
//                    totalSalary = salary - penalty;
//                    salary = totalSalary;
                    salary -= 150;
                    break;
                case "Instagram":
//                    penalty = 100;
//                    totalSalary = salary - penalty;
//                    salary = totalSalary;
                    salary -= 100;
                    break;
                case "Reddit":
//                    penalty = 50;
//                    totalSalary = salary - penalty;
//                    salary = totalSalary;
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
