package day11;

public class Day11WhileLoop02 {
    public static void main(String[] args) {
        //Type code to check if a given integer is palindrome or not
        //Polindrome:121 <==>121 123321 nalan


      /*  int i=1233210;
        String StrI = String.valueOf(i);
       String reverse="";
       int idx=StrI.length()-1;

       while (idx>-1){

           reverse=reverse+StrI.charAt(idx);

           idx--;

       }
       if(StrI.equals(reverse)){
           System.out.println("Palindrome");

       }else{
           System.out.println("Not Palindrome");
       }
    }*/
        String str1="ey edip adanada pide ye";
        String reverse="";
        int idx=str1.length()-1;

        while (idx>-1){

            reverse=reverse+str1.charAt(idx);

            idx--;

        }
        if(str1.equals(reverse)){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }

    }
}
