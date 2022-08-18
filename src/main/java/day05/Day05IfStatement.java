package day05;

import java.util.Scanner;

public class Day05IfStatement {
    /*
    If you score is less than 50 then you will fail
    condition                         action
    true                               executed
    false                             not executed
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = input.nextInt();

        // type code to check if the integer got from user is divided by 3 or not
        if(n%3==0){
            System.out.println("the number is divided by 3");
        }
        if(n%3!=0){
            System.out.println("The number is NOT divided by 3");
        }
        //TYpe code to check if the first digit of a 3 digits integer is less than 5.
        //If it is less than 5 print 'perfect number' otherwise print 'good number'

        if(n/100<5){
            System.out.println("Perfect number");
        }
        if(n/100>=5){
            System.out.println("Good number");
        }
        //Ask user to enter the initial of the day names then print the day names on the console
        System.out.println("Enter the initial of the day names");
        String s = input.next();
        if(s.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        if(s.equals("T")){
            System.out.println("Tuesday and Thursday");
        }
        if(s.equals("F")){
            System.out.println("Friday");
        }
        if(s.equals("W")){
            System.out.println("Wednesday");
        }
                }
    }

