package Basics.L11WhileCicle.P12WhileCicleExercises;
import java.util.Scanner;
public class P05Coins {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scan.nextLine());
        double changeInStotinki = Math.round(changeInLeva * 100); //превръща левовете в стотинки
        int countCoins = 0;

        while (changeInStotinki > 0){
            if (changeInStotinki >= 200){ //2lv
                changeInStotinki -= 200;
                countCoins++;
            } else if (changeInStotinki >= 100) { //1lv
                changeInStotinki -= 100;
                countCoins++;
            } else if (changeInStotinki >= 50) { //50 st
                changeInStotinki -= 50;
                countCoins++;
            } else if (changeInStotinki >= 20) { // 20 st
                changeInStotinki -=20;
                countCoins++;
            } else if (changeInStotinki >= 10) { //10 st
                changeInStotinki -= 10;
                countCoins++;
            } else if (changeInStotinki >= 5) { //5 st
                changeInStotinki -= 5;
                countCoins++;

            } else if (changeInStotinki >= 2) { //2 st
                changeInStotinki -= 2;
                countCoins++;
            } else if (changeInStotinki >= 1) { //1 st
                changeInStotinki -= 1;
                countCoins++;

            }


        }
        System.out.println(countCoins);

    }



}
