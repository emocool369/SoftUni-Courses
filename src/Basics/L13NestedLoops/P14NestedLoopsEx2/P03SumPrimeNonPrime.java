package Basics.L13NestedLoops.P14NestedLoopsEx2;
import java.util.Scanner;
public class P03SumPrimeNonPrime {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while(!input.equals("stop")){
            int num = Integer.parseInt(input);

            boolean isPrime = true;

            if(num < 0){
                System.out.println("Number is negative.");
            input = scan.nextLine();
            continue;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                   isPrime = false;
                   break;
                }

            }
            if (isPrime){
                sumPrime += num;
            }else{
                sumNonPrime += num;
            }
            input = scan.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " +sumNonPrime);
    }
}
