package work02;

import java.util.Scanner;

public class StartsWithEndWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("Lutfen Kelime giriniz");
        String kelime=scan.next();

        if (cumle.startsWith(kelime)) {
            System.out.println("girilen cumle " + kelime + " ile basliyor");
        } else {
            System.out.println("girilen cumle " + kelime + " ile baslamiyor");
        }


        if (cumle.endsWith(kelime)) {
            System.out.println("girilen cumle " + kelime + " ile bitiyor");
        } else {
            System.out.println("girilen cumle " + kelime + " ile bitmiyor");
        }
        scan.close();
    }
}
