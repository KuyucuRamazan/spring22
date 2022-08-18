package com.generics.example;

import java.util.Scanner;

public class DaysChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for getting the week day!");
        int day = sc.nextInt();

    }//making a function/method for switch statement
    public static  String getDayName(int dayy){
        String dayaname = "";
        switch (dayy){
            case 1:
                dayaname = "Monday";
                break;
            case 2:
                dayaname = "Tuesday";
                break;
            case 3:
                dayaname = "Wednesday";
                break;
            case 4:
                dayaname = "Thursday";
                break;
            case 5:
                dayaname = "Friday";
                break;
            case 6:
                dayaname = "Saturday";
                break;
            case 7:
                dayaname = "Sunday";
                break;
            default:
                dayaname = "Invalid day name";

        }
        return dayaname;
    }
}
