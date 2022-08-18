package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop04 {
    public static void main(String[] args) {

        // Find the longest word in a String

        String sentence = "JavaJava is easy if you study. Actually nothing is easy if you do not study.";
//Remove the punctuation marks
        //Put every word in an array ==> [Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]
        //Sort the array elements according to th lengths==>[is,is,if,if,do,you,Java,  easy,   study, Actually, nothing,  easy,  you,  not, study]
        //Last element will be the longest one

        String sentenceWithoutPunctuation = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentenceWithoutPunctuation);

        String words[]=sentenceWithoutPunctuation.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(words));
        System.out.println(words[0]);//

        //How to see all the longest elements if there are more than one

        //[JavaJava, Actually, nothing, study, study, easy, easy, you, you, not, is, if, is, if, do]
        for(String w:words){
            if(w.length()==words[0].length()){
                System.out.println(w+" ");
            }
        }
    }
}
