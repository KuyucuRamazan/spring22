package com.generics.example;

import java.util.Scanner;

public class MonkeyAlive {
    /*
    There is a lonely monkey on island.
he needs to eat 4 bananas every day
there are only 165 bnanas on island
-
Create following variables and find how many days monkey can survive on island
Using while loop
Use increment and decrement and if statements
monkeyAlive
    */
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //System.out.println("");
        int numberofBananas=165;
        int survivalDays=0;
        boolean monkeyAlive=true;
        do {
            System.out.println("Monkey can eat 4 bananas each days: ");
            numberofBananas -= 4;
            survivalDays++;
            System.out.println("Remaining Bananas: "+numberofBananas);
            if(numberofBananas<4){
                monkeyAlive=false;
                System.out.println("Today is the day "+(survivalDays+1)+" and there are not enough bananas");

            }else{
                System.out.println("Today is the day " +survivalDays+"and monkey is still alive.\n");

            }
        } while (monkeyAlive);
        System.out.println("\nTotal number of days the monkey will survive " +(survivalDays));

        }
    }

