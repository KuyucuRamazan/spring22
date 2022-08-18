package work01;

import java.util.Scanner;

public class If04 {
    /*Type code to print the name of the month when you entered the number of the month.
            Example; For 1 output is "January", for 2 output is "February" etc.*/
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a number of month");
        int numOfMonth = input.nextInt();

        if(numOfMonth==1){
            System.out.println("January");

        }else if(numOfMonth==2){
            System.out.println("February");
        }else if(numOfMonth==3){
            System.out.println("March");
        }else if(numOfMonth==4){
            System.out.println("April");
        }else if(numOfMonth==5){
            System.out.println("May");
        }else if(numOfMonth==6){
            System.out.println("June");
        }else if(numOfMonth==7){
            System.out.println("July");
        }else if(numOfMonth==8){
            System.out.println("August");
        }else if(numOfMonth==9){
            System.out.println("September");
        }else if(numOfMonth==10){
            System.out.println("October");
        }else if(numOfMonth==11){
            System.out.println("November");
        }else if(numOfMonth==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid month number");
        }
    }
}
