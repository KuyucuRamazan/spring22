package day09;

import java.util.Scanner;

public class Day09StringManipulation01 {
    public static void main(String[] args) {
        /*
        Example 1: Type code to print just the unit character in a string
        "Hello"==>Heo
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a String to print unique character");
        String str = input.nextLine();

        char c=str.charAt(0);
        if(str.indexOf(c)==str.lastIndexOf(c)){
            System.out.println(c);
        }
        char d=str.charAt(1);
        if(str.indexOf(d)==str.lastIndexOf(d)){
            System.out.println(d);
        }
        char e=str.charAt(2);
        if(str.indexOf(e)==str.lastIndexOf(e)){
            System.out.println(e);
        }
        char f=str.charAt(3);
        if(str.indexOf(e)==str.lastIndexOf(e)){
            System.out.println(e);
        }
        char g=str.charAt(4);
        if(str.indexOf(g)==str.lastIndexOf(g)){
            System.out.println(g);

            String stringVar = "HHHassssan Acaaarz";
            stringVar = stringVar.replaceAll(" ", "");
            int stringVarLenght = stringVar.length();
            String uniqueString = "";

            for (int i = 0; i < stringVarLenght; i++) {
                if (stringVar.length() > 0) {
                    uniqueString = uniqueString + stringVar.substring(0, 1);
                    stringVar = stringVar.replaceAll("[" + uniqueString + "]", "");
                }
            }

            System.out.println(uniqueString);
        }
    }
}
