package work02;

import java.util.ArrayList;
import java.util.List;

public class RepeatChar2 {
    public static void main(String[] args) {
        String str ="Javaisalsoeasy";
        String[] arr= str.split("");
        List<String> list = new ArrayList<>();

        for(int i = 0; i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    if(!list.contains(arr[i]))
                        list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
