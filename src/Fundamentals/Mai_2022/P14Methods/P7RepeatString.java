package Fundamentals.Mai_2022.P14Methods;
import java.util.Scanner;
public class P7RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Integer repeat = Integer.parseInt(scan.nextLine());

        System.out.println(repetition(input, repeat));

    }

    public static String repetition(String text, int repeat){
            String result = "";
        for (int i = 1; i <= repeat; i++) {
            result += text;
        }
        return result;
    }

}
