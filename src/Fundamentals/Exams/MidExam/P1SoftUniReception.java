package Fundamentals.Exams.MidExam;
import java.util.*;
public class P1SoftUniReception {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int employee1 = Integer.parseInt(scan.nextLine()); //number of students that the employee can help per hour
        int employee2 = Integer.parseInt(scan.nextLine());
        int employee3 = Integer.parseInt(scan.nextLine());

        int studentsCount = Integer.parseInt(scan.nextLine());

        int neededHour = 0;
        int workHoursBeforeBreak = 0;

        //every 4th hour, all employees hava a break and do not work for an hour, employees work 3 hours then break for 1 hour

        while(studentsCount > 0){

            int totalStudentsPerHour = employee1 + employee2 + employee3;

            int leftStudents = studentsCount - totalStudentsPerHour;

            if(leftStudents > 0){
                studentsCount = leftStudents;
                neededHour += 1;
                workHoursBeforeBreak +=1;
                if(workHoursBeforeBreak == 3){
                    workHoursBeforeBreak = 0;
                    neededHour += 1;
                }

            } else if (leftStudents <= 0){
                neededHour += 1;
                break;
            } else {
                break;
            }



        }


        System.out.printf("Time needed: %dh.", neededHour);


    }
}
