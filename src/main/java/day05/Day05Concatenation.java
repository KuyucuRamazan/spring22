package day05;

public class Day05Concatenation {
    /*
    Concatenation: Joining Strings with each other or width other data types.
    To do concatenation we have 2 options
    1) Use '+' sign
    2) Use 'concat()' method ==> Inside the concat method


     */
    public static void main(String[] args) {

        String t="Tom";
        String h="Hanks";
        int i=12;
        int k=5;
        char c='A';

        System.out.println(t+" "+h);
        System.out.println(t+i+k);
        System.out.println(t+(i+k));
        System.out.println(i+k+t);
        System.out.println(t+i*k);
        System.out.println(i+c+k);
        System.out.println(t.concat(" ").concat(h));
        System.out.println(c+k+t);

    }
}
