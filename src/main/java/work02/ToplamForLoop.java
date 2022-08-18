package work02;

import java.util.Scanner;

public class ToplamForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer to sum between two integers");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int big;
        int small;

        if(sayi1>sayi2){
            big=sayi1;
            small=sayi2;

        }else{
            big=sayi2;
            small=sayi1;
        }
        int sum =0;
        for(int i= small; i<=big; i++){
            sum+=i;
        }
        System.out.println("the numbers entered and the sum : "+sum);
        scan.close();
    }
}
