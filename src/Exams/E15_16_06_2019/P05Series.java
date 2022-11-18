package Exams.E15_16_06_2019;
import java.util.Scanner;
public class P05Series {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    double budget = Double.parseDouble(scan.nextLine());
    int numSerials = Integer.parseInt(scan.nextLine());

    double finalPriceSerial = 0;
    double totalPrice = 0;

    for (int i = 1; i <= numSerials; i++) {
        String nameSerial = scan.nextLine();
        double priceSerial = Double.parseDouble(scan.nextLine());

        switch (nameSerial){
            case "Thrones":
                finalPriceSerial = priceSerial / 2.0;
                break;
            case "Lucifer":
                finalPriceSerial = priceSerial - (priceSerial * 0.4);
                break;
            case "Protector":
                finalPriceSerial = priceSerial - (priceSerial * 0.3);
                break;
            case "TotalDrama":
                finalPriceSerial = priceSerial - (priceSerial * 0.2);
                break;
            case "Area":
                finalPriceSerial = priceSerial - (priceSerial * 0.1);
                break;
            default:
                finalPriceSerial = priceSerial;
                break;


        }
        totalPrice += finalPriceSerial;
    }

    if (budget >= totalPrice){
        System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
    } else {
        System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
    }

}
}
