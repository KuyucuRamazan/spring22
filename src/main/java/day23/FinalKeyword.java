package day23;

public class FinalKeyword {
    /*
    1)"final methods" body can not be updated can not be overridden
    2) If a variable is "final variable" i)You have to initialize it. "final int y;"gives error, it must be like "final int y=12;
    ii)After initializing, the value of the "final varable" can not be updated.
    3) If a class is "final class", it can not have child classes but "final class" can be a child class.
    i) All wrapper classes are final classes
    ii) All immutable classes are "final classes" so String is a final class.
    */

    final static int x = 12;

    public static void main(String[] args) {


    }
}
