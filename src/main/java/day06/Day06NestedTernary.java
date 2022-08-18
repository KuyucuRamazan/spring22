package day06;

public class Day06NestedTernary {
    public static void main(String[] args) {
        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.

        int year = 2005;
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") :(year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);

        //What if ternary returns different data types

        String s = "Tom Hanks";
//If you have different data types in ternary to see output on the console you can put the ternary directly inside the system.out.println


        System.out.println(s.startsWith("K") ? s.length() : String.valueOf(s.charAt(0)));
        // I itis mendotary ot create a container forthe result of the ternary, convert data types
        String result02 = s.startsWith("K") ? String.valueOf(s.length()) : String.valueOf(s.charAt(0));
        System.out.println(result02);
    }
}
