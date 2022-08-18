package day28;

public class E01 {
  /*
  1) exception is un-expected issue
  2) There are two ways to work with exceptions
    i) Throw Exception ==> Asking help
    ii) Handle Exception ==> Doing it yourself without asking help.
   3) Mainly, there are 2 types of exceptions.
    i) Runtime Exception ==> You will see them after clicking "run" button.
    ii) Compile Time Exception ==> YOu will see it while you type your code.
  */
  public static void main(String[] args) {
      divide(20, 5);
      divide(0, 23);

      divide(39, 0); //ArithmeticException
  }
  public static void divide(int a, int b){
      /*if(b!=0){
          System.out.println(a/b);
      }else {                                   ----This is not recommended----
          System.out.println("Divider can not be Zero");
      }*/

      try {
          System.out.println(a/b);
      } catch (ArithmeticException e){
          System.out.println("A math rule was broken");
          System.err.println(e.getMessage()); //java.lang.ArithmeticException: / by zero

          e.printStackTrace();
      }


  }
}
