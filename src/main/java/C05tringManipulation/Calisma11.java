package C05tringManipulation;

import java.util.Scanner;

public class Calisma11 {

    public static void main(String[] args) {

         /*
        kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi  yazdirin
        isim-soyisim : M****** B****
        kart no : **** **** **** 1234
         */

        Scanner can = new Scanner(System.in);
        System.out.println("lutfen adinizi soyadinizi giriniz");
        String isim = can.nextLine().toUpperCase();
        System.out.println("lutfen kart numaranizi giriniz");
        String kartNo =can.next();

        String isimDuzeltme = isim.charAt(0)+isim.substring(1,(isim.indexOf(" "))).replaceAll("\\w", "*");
        String soyadDuzeltme = isim.split(" ")[1].charAt(0)+isim.substring(isim.indexOf(isim.split(" ")[1].charAt(0)),isim.length()-1).replaceAll("\\w", "*");

        String KN = "**** **** **** "+kartNo.substring(12);

        System.out.println("isim-soyisim : "+isimDuzeltme+" "+soyadDuzeltme+"\nkart no : "+KN);



    }
}
