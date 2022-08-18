package day08;

import javax.print.DocFlavor;

public class Day08StringManipulation01 {

    //If your code gives correct output for some data and it does not give correct data for some others
    //It can not be accepted. That kind of codes are called "Hard coding"
    //If your code works for all data, it is called " Dynamic code"
    public static void main(String[] args) {



        //Count the alphabetical characters in  a given String
        //Tom Hanks!...
        String name = "Tom Hanks!...";

        int numOfLetters = name.replaceAll("[^A-Za-z]","").length();
        System.out.println("numOfLetters: "+numOfLetters);

        //Get the initial from full name. (Middle name is out of scope)
        //Tom Hanks == TH

        String fullName = "  tom Hanks   ";

        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();
        System.out.println("initial:"+initialOfFirstName);

        String initialOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("initialOfLastName:"+initialOfLastName);
        System.out.println(initialOfFirstName+initialOfLastName);

        //Example 3: Fix the day names format like "Sunday"
//"sunday" ==> "Sunday"  "SUNDAY" ==> "Sunday"

        String dayName = "    SaTurDay   ";

        String initialOfDayName=dayName.trim().substring(0,1).toUpperCase();
        String otherCharsOfDayName=dayName.trim().substring(1).toLowerCase();
        System.out.println(initialOfDayName+ otherCharsOfDayName);

        //Example 4: Make all digits except last four digits of a credit card invisible by using "*"
        //1234 1234 1234 1234 ==> **** **** **** 1234
        //Note 1: \\S :different from space
        //\\s space

        String creditCardNumber = "1234 1234 1234 1234";
        String invisiblePart = creditCardNumber.substring(0,15).replaceAll("\\S","*");
        String visiblePart =creditCardNumber.substring(15);

        System.out.println(invisiblePart+visiblePart);

        //Example 5: Count how many characters different from space were used in a String
        //"Tom Hanks was born in 1975."
        //1. way
        String s="Tom Hanks was born in 1975.";
        int numOfChar=s.replace(" ","").length();
        System.out.println("numOfChar: " +numOfChar);

        //2.way
        int numOfCharacters= s.replace(" ", "").split("").length;
        System.out.println(numOfCharacters);

    }
}
/*public class day08.Day08StringManipulation01 {
    public static void main(String[] args) {
        String name = "Tom12 Hanks !...";
        int numOfLetters =  name.replaceAll("[^A-Za-z]","").length();
        System.out.println("numberOfLetter:"+numOfLetters);
        String fullName = " Tom Hanks ";
        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();
        System.out.println("initial:" +initialOfFirstName);
        String initialOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("initialOfLastName:"+initialOfLastName);
        System.out.println(initialOfFirstName+initialOfLastName);
    }
}*/



