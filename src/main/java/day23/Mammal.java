package day23;

public class Mammal extends Animal {
    public Mammal(){
        super("Wooow");
        System.out.println("Mammal constructor work...");
    }
    public Mammal(int num){
        super("Hi");
        System.out.println("Mammal constructor with int parameter worked...");
    }
    public Mammal(String s){
        this(); //this means call the constructor from this class "Mammal()"
        System.out.println("Mammal constructor with string parameter worked...");

    }
}
