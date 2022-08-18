package work02;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatChars {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.nextLine();
        str = str.toLowerCase();
        String repChar= "";

        for (int i = 0; i < str.length(); i++) {
            for (int k = i+1; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    if (repChar.contains(str.substring(i,          i + 1))) {
                        continue;
                    } else repChar = repChar +    str.charAt(i);
                }}}
        String arr []= new String[repChar.length()];
        for (int i=0; i<repChar.length();i++){
            arr[i]= repChar.substring(i,i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
