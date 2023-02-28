package Fundamentals.January_2023.P23ExerciseObjectsAndClasses.P4Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Student> listofStudents = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String studentInfo = scan.nextLine();
            String firstName = studentInfo.split("\\s+")[0];
            String secondName = studentInfo.split("\\s+")[1];
            double grade = Double.parseDouble(studentInfo.split("\\s+")[2]);

            Student newStudent = new Student(firstName,secondName,grade);
            listofStudents.add(newStudent);
        }

        Collections.sort(listofStudents);
        Collections.reverse(listofStudents);

        for (Student currentStudent : listofStudents){

            String getFirstName = currentStudent.getFirstName();

            System.out.printf("%s %s: %.2f%n", currentStudent.getFirstName(), currentStudent.getSecondName(), currentStudent.getGrade());
        //System.out.println(student.getFirstName() +  " " + student.getLastName() + ":" + student.getGrade());
        }

    }
    }


