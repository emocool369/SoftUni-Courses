package Basics.L13NestedLoops.P14NestedLoopsExercises;
import java.util.Scanner;
public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine(); //команда или число
        int sumPrime = 0;
        int sumNonPrime = 0;


        while (!input.equals("stop")){
            int num = Integer.parseInt(input); //ако не е командата stop, ще е число
            boolean isPrime = true; //дали числото е просто или не - ако е просто НЕ ПРОМЕНЯМ boolena, ако не е просто isPrime = false

            if (num < 0){
                System.out.println("Number is negative.");
            input = scan.nextLine();
            continue; // отивам горе while ... и започва проверката отново

            }
            for (int i = 2; i < num; i++) { //започвам цикъла от най-малкото просто число до моя num
                if (num % i == 0){
                    isPrime = false; //моето число не е просто, когато делено на 2 има остатък
                    break;
                }

            }
            if (isPrime){ //ако числото е просто
                sumPrime += num;
            } else {
                sumNonPrime += num;
            }

            input = scan.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
