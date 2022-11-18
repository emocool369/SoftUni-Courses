package Basics.L09ForCicle.P10Excercises2;
import java.util.Scanner;
public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scan.nextLine());


        //do 5 choveka musala
        //6 do 12 - monblan
        //13 do 25 - kilimandjaro
        //26 do 40 - K2
        //41 i poveche - Everest

        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groupNumber; i++){
            int peoplesNumberInAGroup = Integer.parseInt(scan.nextLine());

            if (peoplesNumberInAGroup <= 5){
                musala += peoplesNumberInAGroup;
            } else if (peoplesNumberInAGroup >= 6 && peoplesNumberInAGroup <=12) {
                monblan += peoplesNumberInAGroup;
            } else if (peoplesNumberInAGroup >= 13 && peoplesNumberInAGroup <= 25) {
                kilimandjaro += peoplesNumberInAGroup;
            } else if (peoplesNumberInAGroup >= 26 && peoplesNumberInAGroup <=40) {
                k2 += peoplesNumberInAGroup;
            } else if (peoplesNumberInAGroup >= 41) {
                everest += peoplesNumberInAGroup;
            }


        }

        int totalPeople = musala + monblan + kilimandjaro + k2 + everest;

        System.out.printf("%.2f%%%n", (musala * 1.0/ totalPeople * 100) );
        System.out.printf("%.2f%%%n", (monblan * 1.0/ totalPeople * 100) );
        System.out.printf("%.2f%%%n", (kilimandjaro * 1.0/ totalPeople * 100) );
        System.out.printf("%.2f%%%n", (k2 * 1.0/ totalPeople * 100) );
        System.out.printf("%.2f%%%n", (everest * 1.0/ totalPeople * 100) );

    }
}
