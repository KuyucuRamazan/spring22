package com.generics.example;

public class SetterAndGetterinOOP {
    public static void main(String[] args) {
        Store str=new Store("Faizan Sohail", "Street xyz");
        System.out.println(str);

        str.setName("Ahmet Abraym");
        str.setAddress("Street abc, US");

        System.out.println(str.toString());
    }
}
