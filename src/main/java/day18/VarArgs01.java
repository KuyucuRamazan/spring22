package day18;

public class VarArgs01 {
    /*
    1) Varargs are used to handle multiple parameters in a single parameters in a single method.
    2)Any parameter can not be used after varargs
    3)Before varargs we can use parameters different from varargs
    */
    public static void main(String[] args) {

        System.out.println(add(5,10));
        System.out.println(add(1,2,3));
        System.out.println(add(5));

    }


    public static int add(int x, int... a){
int sum=0;
for(int w: a){
    sum+=w;
}
return sum-x;
    }
}
