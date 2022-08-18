package practice10;

import java.util.Scanner;

public class Q05_05 {
    /*
    Create a method that accepts a String as parameter and finds the sum of digits in that String.

    Example:
    input : J4\/4 1$ 34$¥
    output : 16

    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scan.nextLine();

        sumOfDigits(str);
    }

    public static void sumOfDigits(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum=sum+Integer.valueOf(""+str.charAt(i));
            }

        }
        System.out.println("Sum of digits: "+sum);
    }
}