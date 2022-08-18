package practice02;

public class Q1 {
    public static void main(String[] args) {
        //1 1 2 3 5
        int n1=1;
        int n2=1;
        int n3=0;

        System.out.println(n1+" "+n2+" ");

        for(int i=1; i<9;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;

            System.out.print(n3+" ");
        }
    }


}
