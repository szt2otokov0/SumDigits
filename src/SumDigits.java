import java.util.Scanner;

public class SumDigits {
    private static int input;
    private static int out = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        try {
            input = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Hiba: " + e + ". A program leáll...");
            System.exit(1);
        }
        sum(input);
        System.out.println("A számjegyek összege: " + out);
    }

    private static void sum(int in) {
        out += in % 10;
        if (in < 10) return;
        in /= 10;
        sum(in);
    }
}