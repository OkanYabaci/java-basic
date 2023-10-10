package C02ifStatement;

import java.util.Scanner;

public class Calisma07 {

    public static void main(String[] args) {

         /*
        Eger ilk harf buyuk harf "A" ise "Gecerli sifre" degilse "Gecersiz sifre yazdirin
         Eger ilk harf KUCUK harf "z" ise "Gecerli sifre" degilse "Gecersiz sifre yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scan.next();

        if (sifre.charAt(0) == 'A' || sifre.charAt(0) == 'z'){
            System.out.println("gecerli sifre");
        }else{
            System.out.println("gecersiz sifre");
        }


    }
}
