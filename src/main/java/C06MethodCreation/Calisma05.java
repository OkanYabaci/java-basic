package C06MethodCreation;

import java.util.Scanner;

public class Calisma05 {

    public static void main(String[] args) {

         /*
        Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
numarasini alin.
    * Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
sekilde,
    * KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
duzelten 2 method yazin,
    ve programda kullanabilmek icin duzenlenmis hallerini
geri dondurun.

            -dogum yeri
            -tel no
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim= scan.next();
        System.out.println("Lütfen kredi karti numaranizi giriniz");
        String kkNo = scan.next();

        isimDuzelt(isim);
        isimDuzelt(soyIsim);
        kkNoDuzelt(kkNo);

        System.out.println(isimDuzelt(isim)+" "+isimDuzelt(soyIsim)+"\n"+kkNoDuzelt(kkNo));


    }

    private static String kkNoDuzelt(String kkNo) {
        kkNo = kkNo.substring(0,4)+" "+kkNo.substring(5,9)+" "+kkNo.substring(10,14)+" "+kkNo.substring(11,15);

        return kkNo;
    }

    private static String isimDuzelt(String isim) {
        isim = isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        return isim;

    }

}
