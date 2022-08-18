package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    1)LinkedHashSet put the element in insertion order
    */
    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        System.out.println(lhSet.add(null));
        System.out.println(lhSet.add(null));
        lhSet.add("A");
        lhSet.add("BFED");
        lhSet.add("ZK");
        lhSet.add("M");
        lhSet.add("KLM12");
        lhSet.add("?");


        System.out.println(lhSet);//[null, A, BFED, ZK, M, KLM12, ?]



    }

}
