package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P05SmallShop {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double totalPrice = 0;

        switch (town){
            case "Sofia":
                if (product.equals("coffee")){
                    totalPrice = quantity * 0.5;
                }else if (product.equals("water")){
                    totalPrice = quantity * 0.8;
            }else if (product.equals("beer")){
                    totalPrice = quantity * 1.2;
            }else if (product.equals("sweets")){
                    totalPrice = quantity * 1.45;
            }else if (product.equals("peanuts")) {
                    totalPrice = quantity * 1.6;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")){
                    totalPrice = quantity * 0.4;
                }else if (product.equals("water")){
                    totalPrice = quantity * 0.7;
                }else if (product.equals("beer")){
                    totalPrice = quantity * 1.15;
                }else if (product.equals("sweets")){
                    totalPrice = quantity * 1.30;
                }else if (product.equals("peanuts")) {
                    totalPrice = quantity * 1.5;
                }
                break;
            case "Varna":
                if (product.equals("coffee")){
                    totalPrice = quantity * 0.45;
                }else if (product.equals("water")){
                    totalPrice = quantity * 0.7;
                }else if (product.equals("beer")){
                    totalPrice = quantity * 1.1;
                }else if (product.equals("sweets")){
                    totalPrice = quantity * 1.35;
                }else if (product.equals("peanuts")) {
                    totalPrice = quantity * 1.55;
                }
                break;
        }
        System.out.printf("%.2f", totalPrice);


    }
}
