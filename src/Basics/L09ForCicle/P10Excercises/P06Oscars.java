package Basics.L09ForCicle.P10Excercises;
import java.util.Scanner;
public class P06Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actorsName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int numEvaluaters = Integer.parseInt(scan.nextLine());

            double givenPoints = 0;



        for (int jury = 1; jury <= numEvaluaters; jury++) {

            String nameEvaluater = scan.nextLine();
            double evaluaterPoints = Double.parseDouble(scan.nextLine());

            givenPoints = academyPoints + ((nameEvaluater.length() * evaluaterPoints) / 2);

            givenPoints += givenPoints;





            if (givenPoints >= 1250.5) {
                break;
            }

        }


        if (givenPoints > 1250.5) {
            System.out.printf("Congratulations, %s got nominee for leading role with %.1f!%n", actorsName, givenPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!%n", actorsName, 1250.5 - givenPoints);
        }
    }
}