package C03Ternary;

import java.util.Scanner;

public class Calisma07 {

    public static void main(String[] args) {
        
         /*
        Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere gore dikdortgenin kare olup
        olmadigini yazdirin.
         */
        Scanner can = new Scanner(System.in);
        System.out.println("Dikdortgenin uzunlugunu ve genisligini giriniz");
        int sayi1 = can.nextInt();
        int sayi2 = can.nextInt();
        
//        String result = sayi1 != sayi2 ? "Dikdortgendir" : "Karedir";
//
//        System.out.println("result = " + result);

        System.out.println(sayi1 != sayi2 ? "Dikdortgendir" : "Karedir");

        
    }
}
