package day20;

import day21.Bird;
import day21.Cat;
import day21.Dog;

public class Runner {

    /*
    1)Private class members cannot be inherited
    by child class from parent class.
2)Public class members can be inherited(Always can be inherited)
3)Protected class members can be inherited.(Always can be inherited)
4)Default class members can be inherited from same package.(You can not inherit from other package)
    */
    /*
    Note 1: When we call a variable in a parent-child relationship look at the data type of the object.
    Note 2: When we call a method in a parnt-child relationship look at the constructor of object
    Note 3: There is "IS-A" relationship from "child class" to "parent class"
    Note 4: There is "HAS-A" relationship from "parent class" to "child class"
    Note 5: If there is no parent-child relationship you can not have "HAS-A" or "IS-A" relationship.
    */
    public static void main(String[] args) {

        Cat cat1 =new Cat();
        cat1.meow();
        cat1.drink();
        cat1.eat();
        cat1.move();
        cat1.weight();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.drink();
        dog1.move();
        dog1.weight();

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();
        bird1.move();
        bird1.weight();


    }
}
