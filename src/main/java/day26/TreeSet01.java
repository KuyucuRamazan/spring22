package day26;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    1)TreeSet is for storing "unique elements" in "natural order"
    2)TreeSet is very slow because of that we do not want to do adding, and removing operations with TreeSet
    */

    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("Apple");
        tSet.add("Mango");
        tSet.add("Orange");
        tSet.add("Palm");
        tSet.add("Apricot");
        tSet.add("Palm");
        System.out.println(tSet);//[Apple, Apricot, Mango, Orange, Palm]

        TreeSet<String> sub1 = (TreeSet<String>) tSet.subSet("Apricot", "Orange");//First is inclusive, second is exclusive
        System.out.println(sub1);//[Apricot, Mango]

        TreeSet<String> sub2 = (TreeSet<String>) tSet.subSet("Apricot", false, "Palm", true);//Mango, Orange, Palm
        System.out.println(sub2);

        String el1 = tSet.ceiling("Nancy"); //Orange
        System.out.println(el1);

        String el3 = tSet.ceiling("Man"); //Orange
        System.out.println(el3);

        //ceiling() returns the given element if the given element exist
        String el2 = tSet.ceiling("Mango");
        System.out.println(el2);//Orange


//floor() returns the  element before the given element if the given element does not exist
        String el4 = tSet.floor("Nancy");
        System.out.println(el4);//Mango
//floor() returns the given element if the given element exist
        String el5 = tSet.floor("Nancy");
        System.out.println(el4);//Mango

        //[Apple, Apricot, Mango, Orange, Palm]
        //headSet() returns the elements from the beginning to the given element(exclusive)

        SortedSet<String> sub3= tSet.headSet("Orange");
        System.out.println(sub3);//[Apple, Apricot, Mango]

        SortedSet<String> sub4= tSet.headSet("Orange", true);
        System.out.println(sub4);//[Apple, Apricot, Mango, Orange]

        //[Apple, Apricot, Mango, Orange, Palm]
        //tailSet() returns the elements from the end to the given element(exclusive)
        SortedSet<String> sub5=tSet.tailSet("Mango");
        System.out.println(sub5);//[Mango, Orange, Palm]

        SortedSet<String> sub6=tSet.tailSet("Mango", false);
        System.out.println(sub6);//[Orange, Palm]


    }
}
