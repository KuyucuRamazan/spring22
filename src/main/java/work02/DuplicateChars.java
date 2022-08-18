package work02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        String a="Javaisalsoeasy";
        List<String> list=new ArrayList();
        String array[]=a.toLowerCase().split("");
        for (int i = 0; i <a.length() ; i++) {
            if(a.indexOf(a.charAt(i))!=a.lastIndexOf(a.charAt(i))){
                if(list.contains(array[i])){
                    continue;
                }else{
                    list.add(array[i]);
                }
            }
        }
        System.out.println(list);
    }
}
