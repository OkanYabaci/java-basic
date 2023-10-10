package C06MethodCreation;

import java.util.Scanner;

public class Car {

   public String marka = "Mercedes";

   private int fiyat = 100000;

   public int yas = 1;

    public static void main(String[] args) {
        //Obje olusumu ;

        //1- Class ismini yazalim  2-Objeye isim ver  3- "="  4- new Keyword kullan  5-Class ismini kullan
        Car                         myMercedes             =   new Car();
        System.out.println(myMercedes.marka);
        System.out.println(myMercedes.fiyat);
        System.out.println(myMercedes.yas);

        myMercedes.hareketEt();
        myMercedes.dur();
        System.out.println();
        myMercedes.siparisVer();

    }

    private void siparisVer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("kac adet siparis vermek istiyorsunuz ? ");
        int siparis = scan.nextInt();

        System.out.println("tutar : "+siparis*fiyat);

    }

    private void dur() {

        System.out.println("Mercedes guvenli durus yapar");
    }

    private void hareketEt() {
        System.out.println("Mercedes sessiz calisir, pahalidir");
    }

}
