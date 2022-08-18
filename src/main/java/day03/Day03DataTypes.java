package day03;

public class Day03DataTypes {
/*
Type Casting: Converting number primitive data to another number primitive data type
byte - short - int - long - float - double
Note 1: ıf you convert small data type to large data type, it is called "Auto widening"
Note 2: ıf you convert large data type to small data type, it is called "Ex"

Wrapper classes: Wrapper classes are classes for primitive number data types
byte --> Byte
short --> Short
int --> Integer
long--> Long
float--> Float
double--> Double
char--> Char
boolean--> Boolean

Memory Usage in java

there are 2 types of memories in java
1) stack memory ==> Small
primitive data is stored in stack memory
java puts the adresses of non-primitive data into stack memorystacak

2) Heap memory ==> Huge

 */
    public static void main(String[] args) {

        byte age = 12;
        int myAge = age;

        short populationOfAVillage = 21000;
        double myPopulationOfAVillage = populationOfAVillage;

        double x = 23.45;
        long y = (long)x;

        String name = "Mark Twain";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    //Find the number of characters in name String variable

        System.out.println(name.length()-1);

        //Wrapper classes
        Byte yourAge = 13;
        Boolean isOld = true ;

        //If a method is static, you can access to the method, by using class name.

        //If you access a method by using class name. Then the method is called "static method"
        //If you access a method without using class name then the method is called "non-static method"

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        //double ıs used scientific issues

        //Auto Boxing: convert primitive to non primitive
        //primitive have value non-primitive have value and method
        int a = 12;
        Integer b = a;

//Unboxing is done by Java automatically

    }

}
