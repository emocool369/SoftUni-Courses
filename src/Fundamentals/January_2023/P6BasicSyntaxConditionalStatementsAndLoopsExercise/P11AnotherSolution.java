package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P11AnotherSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //every 2 lost game, headset kaput
        //every 3 lost game, mouse kaput
        //when headset and mouse in the same game kaput, then also keyboard kaput
        //every 2 time keyboard kaput, then also display kaput

        int numLosses = Integer.parseInt(scan.nextLine());
        double priceHeadset = Double.parseDouble(scan.nextLine());
        double priceMouse = Double.parseDouble(scan.nextLine());
        double priceKeyboard = Double.parseDouble(scan.nextLine());
        double priceDisplay = Double.parseDouble(scan.nextLine());

        //int trashedHeadsets = numlosses / 2; - целочислено число
        //int trashedMouse = numlosses / 3; - целочислено число
        //int trashedKeyboard  = numlosses / 6; - целочислено число
        //int trashedDisplay = numlosses / 12; - целочислено число

        double trashedHeadsets = Math.floor(numLosses / 2.0);
        double trashedMouse = Math.floor(numLosses / 3.0);
        double trashedKeyboard = Math.floor(numLosses / 6.0);
        double trashedDisplay = Math.floor(trashedKeyboard / 2.0);

        double totalPriceH = trashedHeadsets * priceHeadset;
        double totalPriceM = trashedMouse * priceMouse;
        double totalPriceK = trashedKeyboard * priceKeyboard;
        double totalPriceD = trashedDisplay * priceDisplay;

        double totalExpense = totalPriceH + totalPriceM + totalPriceK + totalPriceD;

        System.out.printf("Rage expenses: %.2f lv.", totalExpense);

    }
}
