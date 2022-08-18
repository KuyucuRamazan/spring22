package day03;

public class Day03ObjectCreation {

    /*

    We learned how to create template
    1) How to create a class
    2) How to create methods in a class
    3) how to create variables in a class

    how to create object from a class
     */
    public static void main(String[] args) {

        //Create an object to be able to use non-static class members(methods+ variables)
        //ClassName     Object Name    =       new      ClassName()   ;
        Day03ObjectCreation myObject = new Day03ObjectCreation();

        System.out.println(myObject.calculate(1990));

        System.out.println(myObject.printName("Mark", "Twain"));

        System.out.println(myObject.height);
        System.out.println(myObject.id);
        myObject.calculate(1990);

        //Everytime when you create sth in Java name it
        // In Java there are 2 type of creation:1- from stratch 2- from an existing data
    }

    public  String printName(String firstname, String lastname) {

        return firstname +" "+ lastname;
    }
    public  int calculate(int dob){

        return 2022 - dob;
    }
    int height = 185;
    String id = "Sp2022-001";
}
