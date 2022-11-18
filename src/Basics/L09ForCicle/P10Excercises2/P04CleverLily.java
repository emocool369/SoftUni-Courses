package Basics.L09ForCicle.P10Excercises2;
import java.util.Scanner;
public class P04CleverLily {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int age = Integer.parseInt(scan.nextLine());
    double priceWasher = Double.parseDouble(scan.nextLine());
    int priceToy = Integer.parseInt(scan.nextLine());

    //нечетни рожденни дни - играчка
    //четни рожденни дни - пари

    //за първия рожден ден получава играчка
    //за втория рожден ден получава 10 лв, и за всеки следващ рожден ден + 10 лв
    // за всеки 10 лв брат и взима по 1 лв

    //лили продава играчките за Р лева
    //Р лева + спестените пари ><= цената на пералнята

    int sumToys = 0;
    int giftMoney = 0;
    double savedMoney = 0;

    for (int i = 1; i <= age; i += 2){
        sumToys++;
    }

    for (int i = 2; i <= age; i += 2){

        giftMoney = giftMoney + 10; //giftMoney += 10
        savedMoney = savedMoney + (giftMoney - 1); //savedMoney += giftMoney - 1
    }

    int sumMoneyToys = priceToy * sumToys;
    double totalMoney = sumMoneyToys + savedMoney;


    if (totalMoney >= priceWasher){
        System.out.printf("Yes! %.2f", totalMoney - priceWasher);
    } else {
        System.out.printf("No! %.2f", priceWasher - totalMoney);
    }

}
}
