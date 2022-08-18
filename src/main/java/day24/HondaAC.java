package day24;

public interface HondaAC {
    String make = "Samsung";
    double price = 890.00;
    double number =123;
    /*
    Methods:
    1) All methods in an interface must be abstract
    2)using "abstract" keyword is optional for methods.
   3) All methods in an interface must be "public"
    */

    void cool();

    void run();

default void bacteriaKiller(){
    System.out.println("This AC kills %99 bacteries");
}
static void climateCool(){
    System.out.println("This AC cools according to the climate");
}
}
