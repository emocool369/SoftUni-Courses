package Exams.E28_29_2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupNum = Integer.parseInt(scan.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        int allPeople = 0;

        for (int i = 1; i <= groupNum ; i++) {
            int numPeopleInGroup = Integer.parseInt(scan.nextLine());

            if (numPeopleInGroup <= 5){
                musala += numPeopleInGroup;
            } else if (numPeopleInGroup>= 6 && numPeopleInGroup <= 12){
                monblan += numPeopleInGroup;
            } else if (numPeopleInGroup>= 13 && numPeopleInGroup <= 25){
                kilimandjaro += numPeopleInGroup;
            } else if (numPeopleInGroup>= 26 && numPeopleInGroup <= 40){
                k2 += numPeopleInGroup;
            } else if (numPeopleInGroup >= 41){
                everest += numPeopleInGroup;
            }
        }

        allPeople = musala + monblan + kilimandjaro + k2 + everest;

        System.out.printf("%.2f%%%n", musala * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", monblan  * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimandjaro  * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", k2  * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", everest  * 1.0 / allPeople * 100);
    }

}
