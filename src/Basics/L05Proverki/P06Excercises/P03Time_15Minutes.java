package Basics.L05Proverki.P06Excercises;

import java.util.Scanner;

public class P03Time_15Minutes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //часове между 0 и 23
        //минути между 0 и 59
        //четене на час и минути от 24 часово денонощие и изчислява колко е часа след 15 мин
        //печат резултат във формат часове:минути (часовете с една/две цифри, минутите винаги по две цифри, с водеща нула

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalMinutes = minutes + 15;
        int ostatakMinutes = totalMinutes % 60;

        if (totalMinutes >= 60 && hours < 23) {
            hours = hours + 1;
            if (ostatakMinutes < 10) {
                System.out.printf("%d:0%d", hours, ostatakMinutes);
            } else
                System.out.printf("%d:%d", hours, ostatakMinutes);

        } else if (hours >= 23 && totalMinutes >= 60) {
            if (ostatakMinutes < 10) {
                System.out.printf("0:0%d", ostatakMinutes);
            } else
                System.out.printf("0:%d", ostatakMinutes);

        } else {
                System.out.printf("%d:%d", hours, ostatakMinutes);
            }


        }

    }
