package day04;

import java.util.Scanner;

public class Day04Scanner02 {

    /*

    ask user to enter the width and the Lenght of a rectangle and print the area and the perimeter on the console

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("Enter the length of the rectangle");
        double length = input.nextDouble();
        System.out.println("The area of rectangle is "+width*length);
        System.out.println("The perimeter of rectangle is "+2*(width+length));
    }
}
