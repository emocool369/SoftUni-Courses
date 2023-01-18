package Fundamentals.September_2022.P11Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbersArray = new int[n];
        int[] numbersArray2 = new int[n];
        String[] namesArray = new String[n];

        String lineInput = scan.nextLine();
        int[] numbersArrayShortVersion = Arrays.
                stream(lineInput.split(" "))    //1 String Array,Masiv
                .mapToInt(Integer::parseInt) //4
                .toArray(); //2 //1+2+3+4

        String values = scan.nextLine(); //a
        String[] items = values.split(" "); //1 //b
        String[] values2 = scan.nextLine().split(" "); //a + b
        int[] arrayOfValues = new int[items.length]; //2

        for (int i = 0; i < numbersArray.length; i++) { //3

            arrayOfValues[i] = Integer.parseInt(items[i]); //4

            numbersArray[i] = 10 + i;
            namesArray[i] = "10" + i;

            numbersArray2[i] = Integer.parseInt(scan.nextLine());

            System.out.print(numbersArray[i] + " ");
            System.out.println();
            System.out.println(numbersArray2[i] + " ");
            System.out.println();
            System.out.println(arrayOfValues[i] + " ");

        }
        System.out.println();
        System.out.println(String.join(" ", namesArray));

        for (int i = 0; i < numbersArrayShortVersion.length; i++) {
            System.out.printf("%d -> %d%n", i, numbersArrayShortVersion[i]); //отпечатване на масива, който сме създали

        }

    }

}
