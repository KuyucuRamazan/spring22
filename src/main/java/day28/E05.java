package day28;

public class E05 {
    /*
    Note: If there is parent-child relationship between Exception Classes
    and you need to use multiple catch blocks, make the child first,
    otherwise you will get compile tie error.
    */
    public static void main(String[] args) {
        String str = "I love Java";
        getCharsFromStringByIndex(str, 4);

        getCharsFromStringByIndex(str, 12);
    }
    public static void getCharsFromStringByIndex(String str, int idx){

        System.out.println(str.charAt(idx));
    }
}
