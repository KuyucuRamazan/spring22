package day17;

import java.util.Arrays;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
       /* From a given array find all pairs whose sum is a given number
        {4, 6, 5, -10, 8, 5, 20} ==> 10
        For example;  4+6=10, 5+5=10, -10+20=10*/

        List<Integer> list = Arrays.asList(4, 6, 5, -10, 8, 5, 20);
        for(int i=0; i< list.size();i++){
            for(int k=i+1; k<list.size(); k++){
                if(list.get(i)+list.get(k)==10){
                    System.out.println(list.get(i) + " and " + list.get(k));
            }
        }
    }
}
}
