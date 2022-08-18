package day10;

import java.util.Scanner;

public class Day10ForLoop02 {
    public static void main(String[] args) {
        //interview question: type code which reverse the string

        String s = "Tommy";
        String reversed="";

        for (int i=s.length()-1; i>=0; i--){

            reversed = reversed + s.charAt(i);

        }
        System.out.print(reversed);
        //Type code to find the sum of the digits of an integer
        //234==>9
        System.out.println();

        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer to find the sum ofdigits");
        int num = input.nextInt();

        int absNum=Math.abs(num);

        int sumOfDigits = 0;
        for(int i=num;i>0;i=i/10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println(sumOfDigits);
    }
}
