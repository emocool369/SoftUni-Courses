package Exams;

import java.util.Scanner;

public class P03TravelAgency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        String package1 = scan.nextLine();
        String vip = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double price = 0;

        //каква е дължимата сума при резервация?
        //повече от 7 дни, един ден е безплатен

        //("Bansko",  "Borovets", "Varna" или "Burgas")
        //("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        //vip - yes or no

        //"The price is {цената, форматирана до втория знак}lv! Have a nice time!"
        //ако брой дни<1, "Days must be positive number!"
        //град или вид пакет невалидни, "Invalid input!"

        if (days > 7) {
            days = days - 1;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        }
        if (!((town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas")) && (package1.equals("withEquipment") || package1.equals("noEquipment") || package1.equals("withBreakfast") || package1.equals("noBreakfast")))) {
            System.out.println("Invalid input!");
        }
        if ((town.equals("Bansko") || town.equals("Borovets")) && (days > 0)) {
            if (package1.equals("withEquipment")) {
                if (vip.equals("yes")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 100 * 0.9));
                } else {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 100.0));
                }
            }
            if (package1.equals("noEquipment")) {
                if (vip.equals("yes")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 80 * 0.95));
                } else {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 80.0));
                }
            }


        }


        if ((town.equals("Varna") || town.equals("Burgas")) && (days > 0)) {
            if (package1.equals("withBreakfast")) {
                if (vip.equals("yes")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 130 * 0.88));
                } else {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 100.0));
                }
            }
            if (package1.equals("noBreakfast")) {
                if (vip.equals("yes")) {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 100 * 0.93));
                } else {
                    System.out.printf("The price is %.2flv! Have a nice time!", (days * 100.0));
                }
            }


        }



    }

}
