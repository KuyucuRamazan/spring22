package interview_preperation;

import java.util.Scanner;

public class InterviewQuestions01 {
    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap them
        //a=12 and b=13 ==> a=13 and b=12
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextDouble();

        System.out.println("Enter second number");
        double b = input.nextDouble();

        //1.Way
       /* double temp = 0;
        //1. step
        temp = b;
        //2. step
        b = a;
        //3. step
        a = temp;
        System.out.println(a + " - " + b);
*/        //2. Way
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " - " + b);

    }
}
