package practice09;

import java.util.Scanner;

public class Q02_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = scan.nextInt();

        for (int i = row; i > 0; i--) {
            for (int space = row - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < row; i++) {
            for (int space = row - i; space > 1; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
