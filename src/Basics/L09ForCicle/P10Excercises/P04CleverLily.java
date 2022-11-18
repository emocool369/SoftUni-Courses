package Basics.L09ForCicle.P10Excercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());

        //повтаряме за всеки рожден ден - какво е получила
        //начало: 1
        //край: age
        //промяна: +1

        int countToys = 0; //брой играчки
        double savedMoney = 0; //спестени пари
        double giftSum = 0; //сумата, която и подаряват



            for (int birthday = 1; birthday <= age; birthday++) {

            //четен рожден ден - пари
            //нечетен рожден ден - играчка

            if (birthday % 2 == 0) {
                giftSum += 10;
                savedMoney += giftSum - 1;

            } else {
                countToys++;

            }

        }
        //общата събрана сума = (бр.играчки * priceToy) + спестени пари
        double totalSum = (countToys * priceToy) + savedMoney;

        //проверка дали събраните пари стигат за пералнята
        if (totalSum >= price) {
            double leftMoney = totalSum - price;
            System.out.printf("Yes! %.2f", leftMoney);
        }else{
            System.out.printf("No! %.2f", price - totalSum);
        }
    }
}