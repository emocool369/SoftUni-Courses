package Basics.L09ForCicle.Lab;

public class P01NumbersFrom1To100 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%02d%n", i);
        }
        int i = 1;
        for (;i <= 100; i++) {
            System.out.println(i);
        }
    }
}