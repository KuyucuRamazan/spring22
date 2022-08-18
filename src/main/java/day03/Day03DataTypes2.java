package day03;

public class Day03DataTypes2 {

    /*

    Type casting: Converting a primitive data type to another

    byte - short - int - long - float - double

    Note 1: ıf you convert small data type to large data type, iti s called "Auto widening"
    Note 2: ıf you convert large data type to small data type, iti s called "Explicit Narrowing"


    Wrapper classes: Wrapper classes are classes for primitive number data types
byte --> Byte
short --> Short
**int --> Integer
long--> Long
float--> Float
double--> Double
**char--> Character
boolean--> Boolean

memory usage in java
1) stack memory=small
addresses, references , primitive data types
2)heap memory=huge
non-primitive data types

     */
    public static void main(String[] args) {
        byte age = 12;
        int nyAge = age;

        short populationOfAVillage = 21000;
        double myPopulationOfAVillage = populationOfAVillage ;

        //Explicit narrowing
        double x =23.45;
        long y= (long) x;

        String name = "Mark Twain";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length()+1);

        //Wrapper Classes
        Byte yourAge=38;
        Boolean isOld = false;


        //If a method is static, you can access to the method by usig class name.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Auto Boxing
        int a = 12;
        Integer b= a;

        //Unboxing
        int c = b;

        //there are 2 types of memories in Java


    }
}
