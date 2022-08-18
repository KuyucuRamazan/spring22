package work01;

public class socratesReplace01 {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str.replace('a','i'));
        String str1 = "Hello World!";
        System.out.println(str1.toLowerCase().contains("world"));
        System.out.println(str1.indexOf("World"));
        String str2="Hello";
        String str3="HELLO";
        System.out.println(str2.equals(str3.toLowerCase()));
String str4="Learn java, earn money";
        System.out.println(str4.replace("earn","?"));
        String str5 = "Java";
        System.out.println(str5.replace("","/"));
        String str6 = "Thank you!";
        System.out.println(str6.startsWith("Than"));
        System.out.println(str6.startsWith("a",3));

    }
}
