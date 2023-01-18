package Fundamentals.Mai_2022.P14Methods;
import java.text.DecimalFormat;
import java.util.Scanner;
public class P8MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

       DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(power(num, power)));
    }

    public static double power(double num, int power){
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        return result;
    }
}
