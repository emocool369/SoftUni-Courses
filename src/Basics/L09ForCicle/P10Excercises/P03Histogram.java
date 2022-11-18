package Basics.L09ForCicle.P10Excercises;
import java.util.Scanner;
public class P03Histogram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //група -> бр. числа
        //повтаряме за всяко число
        //1. стойността на числото
        //2. проверяваме в коя група е
        //3. увеличаваме бр. на числата с 1
        //начало: 1
        //край: последното число = n
        //промяна: +1

        int count1 = 0; //бр. числа в първата група
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 1; i <= n ; i++) {

            int value = Integer.parseInt(scan.nextLine()); // стойността на числото

            if (value < 200){
                count1++;
            }else if (value >= 200 && value <= 399){
                count2++;
            }else if (value >= 400 && value <= 599){
                count3++;
            } else if (value >= 600 && value <= 799) {
                count4++;
            } else if (value >= 800) {
                count5++;
            }


            //1 - < 200
            //2 - >=200 <=399
            //3 - >=400 <=599
            //4 - >=600 <=799
            //5 - >=800



        }

        System.out.printf("%.2f%%%n", (count1 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (count2 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (count3 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (count4 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (((count5 * 1.0) / n) * 100));

    }
}
