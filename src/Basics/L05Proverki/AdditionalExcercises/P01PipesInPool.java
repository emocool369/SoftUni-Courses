package Basics.L05Proverki.AdditionalExcercises;

import java.util.Scanner;

public class P01PipesInPool {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int v = Integer.parseInt(scan.nextLine()); // obem basein v litri
        int p1 = Integer.parseInt(scan.nextLine()); // debit na purvata truba za chas
        int p2 = Integer.parseInt(scan.nextLine()); // debit na vtorata truba za chas
        double h = Double.parseDouble(scan.nextLine()); // chasovete koito rabotnikut otstustva

        //"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
        //"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."

        double litriP1 = p1 * h;
        double litriP2 = p2 * h;

        double obshtoLitri = litriP1 + litriP2;

        if (obshtoLitri <= v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% Pipe 2: %.2f%%", ((obshtoLitri / v)*100), ((litriP1 / obshtoLitri)*100), ((litriP2 / obshtoLitri)*100));
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, (obshtoLitri - v));
        }

    }

}
