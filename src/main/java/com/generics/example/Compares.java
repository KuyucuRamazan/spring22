package com.generics.example;
import java.util.Scanner;
public class Compares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some alphabet");
        String input = sc.next().toLowerCase();
        //handling uppercase
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        //lowercase
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        //handling wovels
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        //handling the word input
        if(input.length() > 1){
            System.out.println("Error! please enter only a character");
        }else if(!(uppercase || lowercase)){
            System.out.println("Error! Not a alphabet. please enter alphabet in upper or lowercase");
        }else if(vowels){
            System.out.println(input+" is a vowel");
        }else{
            System.out.println(input +" is not a vowel");
        }
    }
}