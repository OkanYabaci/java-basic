package C06MethodCreation;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

        /*
         Soru 1 ) Kullanicidan bir sayi alin.
		 i) Bu sayinin tek mi cift mi oldugunu,

		 ii)sifirdan buyuk mu kucuk mu oldugunu,
		 yazdiran iki method yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        tekMiCiftMi(sayi);
        sifirdanBuyukMu(sayi);

    }

    private static void sifirdanBuyukMu(int sayi) {

        if(sayi<0){
            System.out.println("Sayiniz negatiftir.");
        } else if (sayi > 0) {
            System.out.println("sayiniz pozitiftir.");
        }else {
            System.out.println("sayi sifirdir");
        }
    }

    private static void tekMiCiftMi(int sayi) {

        if(sayi%2 == 0){
            System.out.println("sayiniz cifttir.");
        }else {
            System.out.println("sayiniz tektir.");
        }
    }
}
