package work01;

import java.util.Scanner;

public class If05 {
   /* Type code to print
    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
            b) "Equilateral Triangle" if all sides of a triangle are equal in length.
            c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of three side of triangle");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        }else if(a==b && b!=c || a==c && b!=c || b==c && a!=c){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Neither isosceles, nor equilateral");
        }
    }
}
