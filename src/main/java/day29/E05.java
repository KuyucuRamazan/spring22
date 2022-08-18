package day29;

import java.awt.image.IndexColorModel;

public class E05 {
    /*
    What is the difference between "Exception" and "Error"?
    "Exception"s can be handled, your app can work after handling Exception.
    "Error"s can be handled, your app can not work after getting error.
    NOt: Exceptions and errors are child of "throwable".
    Common Errors: i) OutOfMemory: It occurs ıf the Heap Memory is full.
                    ii) StackOverFlowError: It occurs if the Stack Memory is full.
                    iii) Linkage Error: It occurs if the "dependent" class has any issue.

                    Custom Exception: We can create our own Exception Classes, they can be "Checked"(CTE) or "Unchecked"(Run Time) exception.
                                        i) To be able to create custom Exception gives us flexibility.
                                        ii) To be able to create custom Exception, protect the aplication from the developer mistakes.
    */

    public static void main(String[] args) {
        int grade = 110;


        //How to create "Custom Checked Exception" class.
        class IllegalGradeException extends Exception{
            String message;
            public IllegalGradeException(String message){
                this.message = message;

            }
            public String toString(){
                return message;
            }
        }
    }


}
