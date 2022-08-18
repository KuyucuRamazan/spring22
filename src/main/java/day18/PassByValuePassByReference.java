package day18;

public class PassByValuePassByReference {
    /*
    Java creates copy of values in method calls to protect original value of variables.
    That process is called "Pass by value"
    2)By the help of "Pass by value" we are able to protect the original value
    3)Some programming languages may use "Pass by reference"
     */
    public static void main(String[] args) {
        int num=10;
        System.out.println(add(num));
        System.out.println(num);

        int price=100;
        System.out.println(doDiscount("students",price));
        System.out.println("Original Price: "+price);
        System.out.println(doDiscount("veterans",price));
        System.out.println("Original Price: "+price);

        String greeting="Hello";
        System.out.println(addExclamationMark(greeting));
        System.out.println(greeting);

    }
    public static int add(int num){
        num=num+5;
        return num;

    }
    public static int doDiscount(String status, int price){
        switch (status){
            case "students":
                price=price-10;
            case "veterans":
                price=price-20;
                break;
            case "seniors":
                price=price-5;
                break;
            default:
                price=price;
        }
        return price;
    }
    public static String addExclamationMark(String greeting){

        return greeting+"!";
    }
}
