package work01;

import java.util.Scanner;

public class If06 {
    /*Type code to create a converter which converts mile to km, second to hour, fahrenheit to
    celsius. Find the formulas for conversions from Google.
            a) When user entered 10 and mileToKm String, your code should print "16 km"(The
    number will be dynamic) on the console
    b) When user entered 7200 and secondsToHours String, your code should print "2
    Hours"(The number will be dynamic) on the console
    c) When user entered 83 and fahrenheitToCelsius String, your code should print
 "28.3333 celsius"(The number will be dynamic) on the console*/

    public static void main(String[] args) {

        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Please input number and convert type");
        String fromUser = inputFromUser.nextLine();

        String fromUserText = fromUser.replaceAll("[0-9]", "").trim();
        String fromUserNumber = fromUser.replaceAll("[^0-9]", "").trim();
        double number = Double.parseDouble(fromUserNumber);

        if (fromUserText.equals("mileToKm")) {
            System.out.println("Mile to km: " + (number * 1.6));
        } else if (fromUserText.equals("secondsToHours")) {
            System.out.println("Seconds to hours: " + (number / 3600) + " hours");
        } else if (fromUserText.equals("fahrenheitToCelsius")) {
            System.out.println("Fahrenheit to celsius: " + (number / 2.9294));

        } else {
            System.out.println("Something wrong!");
        }
    }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a number which you want to convert from mile to km");
        double mile = input.nextDouble();

        System.out.println("Enter a number which you want to convert seconds mile to hours");
        double seconds = input.nextDouble();

        System.out.println("Enter a number which you want to convert from fahrenheit to celcius");
        double fahrenheit = input.nextDouble();
      String operator = input.next();
        if(operator.equals("+mileToKm")){
            *//*double mileToKm = mile*1.60934;*//*
            System.out.println(mile*1.60934);
        }else if(operator.equals("+secondToHours")){
           *//* double secondToHours = (seconds/60)/60;*//*
            System.out.println((seconds/60)/60);
        }else if(operator.equals("+fahrenheitToCelcius"));
        *//*double fahrenheitToCelcius = (fahrenheit-32)*5/9;*//*
        System.out.println((fahrenheit-32)*5/9);
    }
*/
}
