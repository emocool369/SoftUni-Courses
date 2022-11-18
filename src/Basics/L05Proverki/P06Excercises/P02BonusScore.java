package Basics.L05Proverki.P06Excercises;
import java.util.Scanner;
public class P02BonusScore {



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());

        double bonusPoints = 0.0;
        double totalSum = 0.0;

        //bonus points 5
        //chetno chislo + 1 point
        // chislo zavurschva na 5 + 2 points

        if (points <= 100){
            bonusPoints = 5;

        }else if (points > 100 && points <=1000){
            bonusPoints = points * 0.2;

        }else if (points > 1000) {
            bonusPoints = points * 0.1;
        }
            if (points % 2 == 0) { //проверка за четно число
                bonusPoints = bonusPoints + 1;
            } else if (points % 10 == 5) {
                bonusPoints = bonusPoints + 2;
            }
            System.out.println(bonusPoints);
            System.out.println(points + bonusPoints);

    }
}
