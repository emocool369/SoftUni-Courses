package Basics.L04FirstStepInCoding.Excercises4Povtorenie.Lab_povtorenie;

import java.util.Scanner;

public class Zoomagazin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numberDogs = Double.parseDouble(scan.nextLine());
        double numberCats = Double.parseDouble(scan.nextLine());

        double costDogsFood = numberDogs * 2.5;
        double costCatsFood = numberCats * 4;

        System.out.println(costCatsFood + costDogsFood + " lv.");

        }
    }

