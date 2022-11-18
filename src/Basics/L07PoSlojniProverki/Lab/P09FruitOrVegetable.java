package Basics.L07PoSlojniProverki.Lab;
import java.util.Scanner;
public class P09FruitOrVegetable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);




                String type = scan.nextLine();

                switch (type){

                    case "banana":
                    case "apple":
                    case "kiwi":
                    case "cherry":
                    case "lemon":
                    case "grapes":
                        System.out.println("fruit");
                        break;
                    case "tomato":
                    case "cucumber":
                    case "pepper":
                    case "carrot":
                        System.out.println("vegetable");
                        break;
                    default:
                        System.out.println("unknown");
                        break;
                }
            }
        }



