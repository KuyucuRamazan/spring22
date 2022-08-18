package practice07;

public class Q01 {
    //Check if a String is palindrome or not.
    //123321
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("12332");
        String str = sb1.toString();

        String reversed = sb1.reverse().toString();
        System.out.println("Is String palindrome?"+sb1.equals(reversed));
    }


}
