package work02;

import java.util.Scanner;

public class WordUsedTme2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
        String kelime=scan.next();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if(ilkIndex==sonIndex){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
        scan.close();
    }
}
