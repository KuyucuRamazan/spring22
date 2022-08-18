package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    1) HashMap is "not-thread safe"
    2) HAshMap is "non-syncronized"
    3) HashMap does not put "entries" in any order.
    4) You can use a single "null" in key part
    5) you can use multiple "null" in values part
    */
    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Tom Hanks", 13);
        hMap.put("Brad Pitt", 24);
        hMap.put("Angelina Julie", 46);
        hMap.put("Cuneyt Arkın", 85);
        hMap.put("Alex Alex", 33);
        System.out.println(hMap);//{Tom Hanks=13, Brad Pitt=24, Cuneyt Arkın=85, Angelina Julie=46, Alex Slex=33}

        //How to work with "key"s

        //Example 1: How many letters were used in all names?
        Set<String> keys = hMap.keySet();

        int totalNumOfLetters = 0;

        for (String w : keys){
            totalNumOfLetters = totalNumOfLetters + w.replaceAll("[^a-zA-Z]", "").length();
            //System.out.println(w + "!");
        }
        System.out.println(totalNumOfLetters);
//Example 2: Find the average age of the students
        Collection<Integer> values = hMap.values();
        double sum=0;
        double avg = 0;
        for (Integer w : values){
            sum = sum + w;


        } avg = sum / values.size();
        System.out.println(avg);

        //How to get a specific value
        int age1 = hMap.get("Cuneyt Arkın");
        System.out.println(age1);//85

        Integer age2=hMap.getOrDefault("Cuneyt Arkınn", 0);
        System.out.println(age2);

        Integer age3 = hMap.putIfAbsent("Angelina Julie", 32);
        System.out.println(age3);

        hMap.put("Alex Alex", 99);
        System.out.println(hMap);

        //How to get entries from a map
        Set<Map.Entry<String,Integer>> entries= hMap.entrySet();
        System.out.println(entries);



        //Example 3: Get the initials of first 3 entries
        String initials="";


            int counter = 0;
            //{Tom Hanks=13, Brad Pitt=24, Cuneyt Arkın=85, Angelina Julie=46, Alex Alex=33}
            for(Map.Entry<String,Integer> w : entries){
            initials = initials + w.getKey().charAt(0); //gives first character
            counter++;
            if (counter == 3 ){
                break;
            }
        }
        System.out.println(initials);
           boolean exist1 = hMap.containsKey("Angelina Julie");
        System.out.println(exist1);
        boolean exist2 = hMap.containsValue(85);
        System.out.println(exist2);

      hMap.replace("Cuneyt Arkın", 85, 63);
        System.out.println(hMap);
        hMap.replace("Alex Alex", 44);
        System.out.println(hMap);

    }
}
