package Fundamentals.January_2023.P6BasicSyntaxConditionalStatementsAndLoopsExercise;


import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startBudget = Double.parseDouble(scan.nextLine());
        int numberStudents = Integer.parseInt(scan.nextLine());
        double priceLightSaber = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());

        double totalAmount = 0;
        double totalPriceB = 0;

        double totalPriceLS = (Math.ceil(numberStudents * 1.1)) * priceLightSaber;
        double totalPriceR = numberStudents * priceRobes;
        if(numberStudents >= 6) {
            totalPriceB = (numberStudents - Math.floor((numberStudents / 6.0))) * priceBelt;
        }else{
            totalPriceB = numberStudents * priceBelt;
        }
        totalAmount = totalPriceLS + totalPriceR + totalPriceB;

        if(startBudget >= totalAmount){
            System.out.printf("The money is enough - it would cost %.2flv.", totalAmount);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalAmount - startBudget);
        }


    }
}