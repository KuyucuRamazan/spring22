package day02;

public class Day02Variables {

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //If you create a variable inside the main method , Java

        //create a char variable
        // Do not forget to put the value btween single quates
        //Default value of char is the character whose value is zero
        char initial = 'S';
        //create a boolean variable
        //Default value of boolean is false
        boolean isOld = true;
        boolean isAlive = false;

        //create a byte variable
        byte ageOfStd = 31;

        //create a short variable
        short populationOfVillage = 32323;

        //create a long variable

        long populationOfWorld = 7123456789L;
    }

    //How to create a variable
         //Data Type - Variable Name - Equal Sign - Value - Semi Colon
   static int             age             =           38      ;

    static int height = 178;
    //create a double variable
    public static double weight = 68.9;
    //Note: If you do not type any access modifier, it means the access modifier is "default"
/*
Data types in Java
1)Primitive Data Types
i)Those data types were created by Java, we can not create
ii) 8 types
a) byte-short-int-long-float-double/char-boolean
char: ıt ıs for single characters
boolean: ıt ıs for true false values

byte: -128 to 127
short: -32 thousand to 32 thousand
int:-2 billion to 2 billion
long: -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807

float: it is used for decimals. float uses memory less than double.
when you create float data type you have to put "F" or "f" at the end
float has 7 digits at most in decimal part.
double: ıt is used for decimals. double is used for scientific researches
double has 16 digits at most in decimal
2)Non-Primitive Data Types
1)those data types can be created
String is non-primitive data type
String data type is used for multiple characters.

String nameOfStudent=

Note: What is the difference between  "primitive" and "non-primitive"
 1-primitive data types are created by Java non-primitive data types are created by developers
 2-primitive data types start with lower cases, non-primitive data types start with upper cases
 3-primitive data types have just value but non-primitive data types have both value and references(this is the main difference)
 4- primitive data types use different size of memory, but non-primitive data types use memory same.

 */


    String nameOfStd = "Mark Twain";
    String stdId = "Mt2022_01";
}
