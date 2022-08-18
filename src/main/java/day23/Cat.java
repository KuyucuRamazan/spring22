package day23;

public class Cat extends Mammal{
    public Cat(){
        super(12);// super() mus be in the first line in constructor body
                        // In a constructor body you can do just a single constructor call, multiple calls are not allowed
        System.out.println("Cat constructor worked...");

    }
    public Cat(boolean b){
      super(); //Typing "super();" is optional. If you type your codewill be more readable.
        System.out.println("Cat constructor with boolean parameter worked...");
    }
}
