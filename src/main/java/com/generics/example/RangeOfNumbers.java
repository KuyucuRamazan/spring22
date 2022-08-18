package com.generics.example;

import java.util.Scanner;

public class RangeOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
        for(int i=start ; i<=end; i++){
            System.out.print(" "+i);
        }
    }
}
