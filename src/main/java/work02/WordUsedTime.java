package work02;

import java.util.Scanner;

public class WordUsedTime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
        String kelime=scan.next();

        int index=cumle.indexOf(kelime);


        if (index<0) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (cumle.indexOf(kelime, index+1)==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        scan.close();
    }
}
