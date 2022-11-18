package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P12TradeCommissions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        double totalIncome = 0;

        switch (town){
            case "Sofia":
                if (sales >= 0 && sales<= 500){
                    totalIncome = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    totalIncome = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    totalIncome = sales * 0.08;
                } else if (sales > 10000){
                    totalIncome = sales * 0.12;
                }

                break;
            case "Varna":
                if (sales >= 0 && sales<= 500){
                    totalIncome = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    totalIncome = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    totalIncome = sales * 0.10;
                } else if (sales > 10000){
                    totalIncome = sales * 0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales<= 500){
                    totalIncome = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    totalIncome = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    totalIncome = sales * 0.12;
                } else if (sales > 10000){
                    totalIncome = sales * 0.145;
                }
                break;
        }
        if (sales < 0 || !town.equals("Sofia") && !town.equals("Varna") && !town.equals("Plovdiv")){
            System.out.println("error");

        } else {
            System.out.printf("%.2f", totalIncome);
        }
    }
}
