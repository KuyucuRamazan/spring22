package day20;


    /*
    Polymorphism = Overloading + Overriding
    1)We need methods with "same name" and "different parameters" to make our codes more readable
    This is "method overloading"
    2)HOw can you make the parameters
     ==> public static int add(int a, int b){} and ==> public static double add(double a, double b){}

     */

    public class Overloading01 {
        public static void main(String[] args) {

        }



        private static String add(String a, int b){
            return a+b;

        }
        private static String add(int a, String b){
            return a+b;
        }
}
