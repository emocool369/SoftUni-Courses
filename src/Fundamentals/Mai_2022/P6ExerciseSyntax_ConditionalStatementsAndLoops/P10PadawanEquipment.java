package Fundamentals.Mai_2022.P6ExerciseSyntax_ConditionalStatementsAndLoops;
import java.util.Scanner;
public class P10PadawanEquipment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scan.nextLine());
        int numStudents = Integer.parseInt(scan.nextLine());
        double priceLightsaber = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());

        double newNumStudents = Math.ceil(numStudents * 1.1);
        //10% more lighsabers, rounded up to the next integer
        //every 6 belt is free

        double totalPriceLightsabers = newNumStudents * priceLightsaber;
        double totalPriceRobes = (numStudents * priceRobe);
        double totalPriceBelts = priceBelt * (numStudents - Math.floor(numStudents / 6.0));

        double totalPrice = totalPriceLightsabers + totalPriceRobes + totalPriceBelts;

        if (totalPrice <= availableMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - availableMoney);
        }

    }

}
