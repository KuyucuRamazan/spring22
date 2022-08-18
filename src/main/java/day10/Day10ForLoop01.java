package day10;

public class Day10ForLoop01 {

    //Type "Hi!" on the console 5 time

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //By using loops you can use repeating actions without repeating your codes
// There are 4 loops; 1) for-loop 2) while-loop 3) do-while-loop 4) for-each-loop

        //1)for-loop
        //Starting value Condition

        System.out.println("==============");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi!");
        }

        //Example 1: Type integers from 10 to 3 on the console by using for loop

        for (int i = 10; i >= 3; i--) {
            System.out.print(i + " ");
        }
        //Example 1: Type even integers from 4 to 15 on the console by using for loop

        for (int i = 4; i < 16; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("================");
        //2.way

        for (int j = 4; j < 16; j++) {
            if (j % 2 == 0) {
                System.out.println(j + " ");
            }
        }
            //ex 3 : Type odd 4-15

            for (int i = 4; i < 16; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            //Ex 4: print integer from 10-32 except 17
        for(int i=10; i<33;i++){
            if(i!=17){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        //2. way
        for(int i=10; i<33;i++){
            if(i==17){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        //Ex 4: 10-32 except 18-21
        for(int i=10; i<33;i++){
            if(i>18&&i<21){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        //Ex 5: Print String characters one by one on the console. If you see "x" stop printing
        //example: Publix is the best==> Publi
        String str="Publix is the best";

        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='x'){
                break;
            }
            System.out.print(str.charAt(i));
        }
        }
    }


