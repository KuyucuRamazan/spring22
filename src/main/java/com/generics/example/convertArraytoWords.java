package com.generics.example;

import java.util.Arrays;

public class convertArraytoWords {
    public static void main(String[] args) {
        String[] arr = { "J","a","v","a","i","s","d","i","f","f","i","c","u","l","t"};
        System.out.println(Arrays.toString(arr));
        String str="";
        for(String w:arr){
            str+=w; //str=str+w;
        }
        System.out.println(str);
        //replacing the string
        String strFinal=str.replace("is", "isNot");
        System.out.println(strFinal);
    }
}
