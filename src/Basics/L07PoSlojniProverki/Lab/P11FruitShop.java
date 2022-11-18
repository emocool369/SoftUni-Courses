package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P11FruitShop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double totalPrice = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")){
                    totalPrice = quantity * 2.5;
                } else if (fruit.equals("apple")){
                    totalPrice = quantity * 1.2;
                }else if (fruit.equals("orange")){
                    totalPrice = quantity * 0.85;
                }else if (fruit.equals("grapefruit")){
                    totalPrice = quantity * 1.45;
                }else if (fruit.equals("kiwi")){
                    totalPrice = quantity * 2.70;
                }else if (fruit.equals("pineapple")){
                    totalPrice = quantity * 5.50;
                }else if (fruit.equals("grapes")) {
                    totalPrice = quantity * 3.85;
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")){
                    totalPrice = quantity * 2.7;
                } else if (fruit.equals("apple")){
                    totalPrice = quantity * 1.25;
                }else if (fruit.equals("orange")){
                    totalPrice = quantity * 0.9;
                }else if (fruit.equals("grapefruit")){
                    totalPrice = quantity * 1.60;
                }else if (fruit.equals("kiwi")){
                    totalPrice = quantity * 3.0;
                }else if (fruit.equals("pineapple")){
                    totalPrice = quantity * 5.60;
                }else if (fruit.equals("grapes")) {
                    totalPrice = quantity * 4.20;

                }
                break;

        }
        if (totalPrice > 0) {
            System.out.printf("%.2f", totalPrice);
        }else{
            System.out.println("error");
        }

    }
}
