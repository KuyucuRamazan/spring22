package day06;

public class Day06Ternary {
    public static void main(String[] args) {

        //Type code to check if a number is positive or not
        int x = -996;
        /*if(x>0){
            System.out.println("Positive");

        }else{
            System.out.println("Not positive");
        }
        //2.way
        String result = x>0 ? "Positive" : "Not positive";
        System.out.println(result);*/

        //type code to check if an integer has 3 digits or not

        int absX = Math.abs(x);
        String result = absX>=100 && absX<1000 ? "3 digit number" : "Not 3 digit number";
        System.out.println(result);

        //type code to check following conditions for state abbreviations in the
        // 1) It should have 2 characters    2) ıt should have just uppercase
        String s = "FLe";

        String result3 = s.length()==2 && s.replaceAll("A-Z", "").length()==0 ? "Valid abbreviation" : "Invalid abbreviation";
        System.out.println(result3);
    }
}
