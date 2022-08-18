package day06;

import java.util.Scanner;

public class Day06IfElseStatement02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pasword");
        String pwd = input.next();
//xyz?+123
        //Ask user to enter the password then check if the password is valid or not according to the given rules
        //1) At least 8 characters 2) Contains at least 1 Uppercase 3) contains at least 1 lowercase 4) contains at least 1 symbol

        if (pwd.length() < 8) {
            System.out.println("Password is invalid because it does not have at least 8 characters");
        } else if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one uppercase");
        }else if((pwd.replaceAll("[^a-z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have at least one lowercase");
//Regex: Regular expressions: They are used to define a group of data ^ mean different from ^abc means different from abc
        }else if (pwd.replaceAll("[A-Za-z0-9]","").length()==0){
            System.out.println("Password is invalid because it does not have any symbol");

        } else {
            System.out.println("Password is valid, welcome to Chase Bank");
        }
        System.out.println("==========================");

        //2.way
        if (pwd.length() < 8) {
            System.out.println("Password is invalid because it does not have at least 8 characters");
        }
        if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one uppercase");
        }
        if((pwd.replaceAll("[^a-z]", "")).length()==0){
            System.out.println("Password is invalid because it does not have at least one lowercase");
//Regex: Regular expressions: They are used to define a group of data ^ mean different from ^abc means different from abc
        }
        if (pwd.replaceAll("[A-Za-z0-9]","").length()==0){
            System.out.println("Password is invalid because it does not have any symbol");
        }
    }
    }
