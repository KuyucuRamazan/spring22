package com.generics.example;

import java.util.Scanner;

public class EvenLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                System.out.println (i);
            }
            i++;
        }
    }
}
