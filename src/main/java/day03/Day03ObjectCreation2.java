package day03;

public class Day03ObjectCreation2 {
    /*


    We learned how to create template
    1) How to create a class
    2) How to create methods in a class
    3) how to create variables in a class

    how to create object from a class


     */
    public static void main(String[] args) {
        //create an object to b able to use  non-static class members(variables+methods)
        //ClassName     Object Name    =       new      ClassName()   ;
        Day03ObjectCreation myObject   =      new Day03ObjectCreation();

        System.out.println(myObject.height);
        System.out.println(myObject.printName("Mark", "Twain"));
//I will use that template, You should name when you create sth in java
        //there are two types of creation in Java 1) from stratch 2) from existing data
    }
    public String printname(String firstname, String lastname){

        return  firstname+" "+lastname;
    }
    public int calculateAge(int dob) {
        return 2022-dob;
    }
    int height = 178;
    String id="Sp2022-001";
}
