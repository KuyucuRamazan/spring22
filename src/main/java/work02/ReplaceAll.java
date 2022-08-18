package work02;

public class ReplaceAll {
    public static void main(String[] args) {
        String cumle= "Java    cok         zevkli";

        cumle=cumle.replaceAll("\\s+", " ");

        System.out.println(cumle); //Java cok zevkli



        System.out.println(cumle.replaceAll("[a-z]", "")); //J

        System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
        System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli

    }
}
