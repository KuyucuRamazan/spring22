package day28;

public class E04 {
    //"try block" can not be used alone, can be used with 1 or more catch blocks.
    //"try block" can not be used alone,
    public static void main(String[] args) {

        convertStringToIntegerThenDivideByGivenNum("123",2);
        convertStringToIntegerThenDivideByGivenNum("123q",3);
        convertStringToIntegerThenDivideByGivenNum("100",0);
        convertStringToIntegerThenDivideByGivenNum("50",5);
    }
    public static void convertStringToIntegerThenDivideByGivenNum(String str, int num){
    try{
        System.out.println(Integer.parseInt(str)/ num);
    }catch (NumberFormatException e){
        System.err.println("Issue occurred in conversion");
    } catch (ArithmeticException e){
        System.out.println("Issue occurred in conversion");
    }


    }
}
