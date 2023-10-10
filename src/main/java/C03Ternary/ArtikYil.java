package C03Ternary;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        
         /*
        kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
        
        i) 4'e bolunemeyen yillar artik yil degildir.
        ii) 4'e bolunup 100 ile bolunemeyen yillar artik yildir.
        iii) 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olanlar artik yildir.
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen kontrol etmek istediginiz yili giriniz");
        int yil = can.nextInt();
        
        String sonuc = yil % 100 == 0 ? (yil % 400 == 0 ? "artik yildir" : "artik yil degildir") : (yil % 4 == 0 ? "Artik yildir" : "Artik yil degildir");

        System.out.println("sonuc = " + sonuc);

 //       System.out.println(yil % 100 == 0 && yil % 400 == 0 || yil % 4 == 0 ? "Artik yildir" : "Artik yil degildir" );




    }
}
