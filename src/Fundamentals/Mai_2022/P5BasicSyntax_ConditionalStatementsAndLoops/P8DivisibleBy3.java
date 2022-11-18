package Fundamentals.Mai_2022.P5BasicSyntax_ConditionalStatementsAndLoops;

public class P8DivisibleBy3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
