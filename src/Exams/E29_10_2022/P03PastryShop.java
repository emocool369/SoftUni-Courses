package Exams.E29_10_2022;
import java.util.Scanner;
public class P03PastryShop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int numOrderedCakes = Integer.parseInt(scan.nextLine());
        int dayInDecember = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;

        switch (input){
            case "Cake":
                if (dayInDecember <= 15){
                    totalPrice = numOrderedCakes * 24;
                } else {
                    totalPrice = numOrderedCakes * 28.7;
                }
                break;
            case "Souffle":
                if (dayInDecember <= 15){
                    totalPrice = numOrderedCakes * 6.66;
                } else {
                    totalPrice = numOrderedCakes * 9.8;
                }
                break;
            case "Baklava":
                if (dayInDecember <= 15){
                    totalPrice = numOrderedCakes * 12.6;
                } else {
                    totalPrice = numOrderedCakes * 16.98;
                }
                break;
        }

        if (dayInDecember <= 22){
            if (totalPrice >= 100 && totalPrice <= 200){
                totalPrice = totalPrice - (totalPrice * 0.15);
            } else {
                totalPrice = totalPrice - (totalPrice * 0.25);
            }
        }

        if (dayInDecember <= 15){
            totalPrice = totalPrice - (totalPrice * 0.1);
        }
        System.out.println(totalPrice);
    }
}
