package day22;

public class Runner {
    /*
1)"Method Overriding" means updating method body to make the implementation specific for the child class.
2)Mostly we do not touch access modifiers, and "return type" of the "overriden method"(The method in the parent class)
3)In "Method Overriding" method name can not be changed.
If you change the method name it means you are creating a new method.
4) Inheritance is prerequisite for "Method Overriding". If there is not "parent-child" relationship, there will be no "Method Overriding"
5) The method in child class "overriding method".
6) Access modifier of " overriding method " can not be narrower than the acess modifier of overridden method.
7) Return type can not be narrower than the data returned.
8) Return type of overriding method can not be wider than the override.
Note: Normally return type can be Object everytime but in method overriding it can be the return type of the overridden
example: The return type of the overridden method is Mammal.
What can be the return type of the method
    */
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.eat();

        Dog dog1= new Dog();
        dog1.eat();
        dog1.giveBirth();

        Bird bird1= new Bird();
        bird1.eat();
    }
}
