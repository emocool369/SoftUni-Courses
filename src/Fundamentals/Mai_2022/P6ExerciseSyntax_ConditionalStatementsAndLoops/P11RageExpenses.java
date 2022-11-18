package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P11RageExpenses {
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


        double trashedHeadsets = Math.floor(numLosses / 2.0);
        //int tH = numLosses / 2;
        double trashedMouse = Math.floor(numLosses / 3.0);
        //int tM = numLosses / 3;
        double trashedKeyboard = Math.floor(numLosses / 6.0);
        //int tK = numLosses / 6;
        double trashedDisplay = Math.floor(trashedKeyboard / 2.0);
        //int tD = numLosses / 12;

        double totalPriceH = trashedHeadsets * priceHeadset;
        double totalPriceM = trashedMouse * priceMouse;
        double totalPriceK = trashedKeyboard * priceKeyboard;
        double totalPriceD = trashedDisplay * priceDisplay;

        double totalExpenses = totalPriceH + totalPriceM + totalPriceK + totalPriceD;

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);

    }
}
