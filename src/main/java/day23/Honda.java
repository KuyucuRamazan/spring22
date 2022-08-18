package day23;
/*
1)If you do not put a "body" for a method it will be "abstract method"
2)to make a method "abstract" you have to use "abstract" keyword before the return type.
3)"abstract method" can not be put into a regular class, when you create an abstract method you have to make the class "abstract"
4)To make a class abstract use "abstract" keyword before the "class" keyword
5)The method without body is called "abstract method", the method with body is called "concrete method"
6)"Concrete Child Classes" must "override(implement)" abstract methods from all parents, otherwise Java gives CTE.
7)"Abstract Classes" may have both "abstract methods" and "concrete methods"
8)If you want to make a functionality mandotary for all "concrete child classes" make the method "abstract" in parent classes
9)Can we make an "abstract class" final class.
"final classes can not have child classes but we creae "abstract classes" to do sth
mandatory for child classes. This is contradiction because of that Java does not allow to make an abstract class "final".
10)"abstract methods" were created to override, if you make an abstract ethod "private"
it can not b overridden, therefore Java does not allow
11)We can not create objects from "abstract classes" because "abstract classes" have sth un-complete
 like "abstract methods"
  Note: "abstract classes" are classes, therefore they have "constructors", but the constructors can not create objects.
12)If any abstract method was overridden by any concrete class (A),
it is not mendatory to override the abstract method for the concrete child classes of the
  */

public abstract class Honda {
     public abstract void engine();

    public void musicSystem(){
        System.out.println("The most updated music system...");
    }

}
