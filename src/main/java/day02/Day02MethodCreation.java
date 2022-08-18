package day02;

public class Day02MethodCreation {

    public static void main(String[] args) {


        int a;
        int b;
        System.out.println(addIntegers(12, 5));

        System.out.println(multiplyIntegers(8, 5));

        System.out.println(subtractInteger(12, 7));

        System.out.println(divideIntegers(24, 5));
    }
// create an addition method
    public static int addIntegers(int a, int b){

        return a + b;
    }

    // Create a multiplication method
    public static int multiplyIntegers(int a, int b){

        return a * b;
    }
    public static int subtractInteger(int a, int b){

        return a - b;
    }

//Create a dynamic division method
    public static double divideIntegers(int a, int b) {

        return a / b;
    }

    
}
