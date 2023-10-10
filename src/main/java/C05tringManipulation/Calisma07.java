package C05tringManipulation;

import java.util.Scanner;

public class Calisma07 {

    public static void main(String[] args) {

        /*
        kullanicidan isim ve soyisim isteyin hangisinin uzun oldugunu yazdirin (ad-soyad)
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen isim ve soyad giriniz");
        String adSoyad =can.nextLine();

        int adSoyadBoyu = adSoyad.length(); // yunus can -> 9
        int soyadinBoyu = (adSoyad.length()-1)-adSoyad.indexOf(" ");

        System.out.println(adSoyadBoyu-soyadinBoyu < soyadinBoyu ? "soyadiniz uzun" : " adiniz uzun");



    }
}
