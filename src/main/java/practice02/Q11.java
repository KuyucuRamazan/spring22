package practice02;

import java.util.Scanner;

public class Q11 {
    //Ask user to enter first name, middle name and last name as one single String,
    // then print the first character of middle name and last name.
    //e.g. Mark Hansel Twain==> HT

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name, middle name, and last name ");
        String str = input.nextLine().trim();

        char initialOfMiddle=str.charAt(str.indexOf(" ")+1);
        System.out.print(initialOfMiddle);
        char initialOfLastname=str.charAt(str.lastIndexOf(" ")+1);
        System.out.print(" "+initialOfLastname);

    }
}
