package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop02 {
    public static void main(String[] args) {
        //Sort the array elements according to their lengths. ==> "Ali" - "Veli" - "Maria" - "Michael"

        String arr[] ={"Micheal", "Ali", "Maria", "Veli"};
        System.out.println(Arrays.toString(arr));//["Micheal", "Ali", "Maria", "Veli"]
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//["Ali","Veli","Maria","Micheal"  ]

        //Sort the array elements according to their lengths in descending order
        //["Micheal", "Ali", "Maria", "Veli"] ==> "Micheal","Maria","Veli", "Ali",
        String brr[] = {"Jackson", "Tom", "xxxxxx","Dustin", "Mary", };
        Arrays.sort(brr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(brr));//"Jackson","Dustin","Mary" ,"Tom"
        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order
        //["Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"]
        String crr[] = {"Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"};
        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //Note: "natural order" means "alphabetical order" for Strings and "ascending order" in numbers

    }
}
