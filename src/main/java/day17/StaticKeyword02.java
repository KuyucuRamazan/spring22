package day17;

public class StaticKeyword02 {
    public static void main(String[] args) {
        //Just Class Name is enough to access "static" things
        System.out.println(StaticKeyword01.sCounter);

        //To access non-static things you have to create object
        StaticKeyword01 obj04 = new StaticKeyword01();
        System.out.println(obj04.counter);

        System.out.println(obj04.sCounter);

        //To access "static" things using objects is allowed
        //but not recommended
        System.out.println(obj04.sCounter);
    }


}
