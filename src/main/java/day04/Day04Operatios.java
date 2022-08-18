package day04;

public class Day04Operatios {


         /*
            Operations in Java
            1) +, -, *, /
               Order of operations: i)Operations inside parenthesis
                                   ii)Multiplications and divisions
                                   ii)Additions and subtractions
            2)Increment and Decrement operations
               Increment ==> addition and multiplication
               Decrement ==> subtraction and division

            3)Comparison Operators
              >, <, >=, <=, ==, !=
              Note: In Math, single equal sign '=' means equality but in Java double equal sign '==' means equality
              Note: In Java, '!' means 'not' so '!=' means 'not equal'
              Note: All comparison operators return boolean

            4)Logical Operators
               i) AND Operator: && ==> This operator is used between two boolean values
                  true && true ==> true
                  true && false ==> false
                  false && true ==> false
                  false && false ==> false

               ii) OR Operator: || ==> This operator is used between two boolean values
                   true || true ==> true
                   true || false ==> true
                   false || true ==> true
                   false || false ==> false
     */
         public static void main(String[] args) {

             int result = 10 - 6/(2 + 5/5) + 7;
             System.out.println(result);

             int a = 12;
            // a=a+3;
             a +=5;
             System.out.println(a);
             int b=4;
             //b=b*3;
             b*=6;
             System.out.println(b);

             //
             int c=18;
             c-=3;
             System.out.println(c);
             int d=24;
             d/=6;
             System.out.println(d);

             //Increment and Decrement by 1

             int e=12;
             e=e+1;
             e+=1;
             e++;
             System.out.println(e);

             int f = 13;
             f = f-1;
             f-=1;
             f--;
             System.out.println(f);

             //Comparison Operator
             int h=12;
             int i=13;
             System.out.println(h<i);
             System.out.println(h==i);
             System.out.println(h<=i);
             System.out.println(h!=i);
             System.out.println("----");
             //Logical Operator
             System.out.println(3<4 && 5>1);
             System.out.println(3>4 && 5>1);

             System.out.println(3>4 || 5>6);
             System.out.println(5>4 || 5>6);

             // Post - increment
             int x = 12;
             int y = x++;

             System.out.println(y);

             //pre- increment

             int m = 12;
             int n = ++m;


             System.out.println(n);
    }

}
