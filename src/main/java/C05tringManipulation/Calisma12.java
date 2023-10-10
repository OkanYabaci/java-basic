package C05tringManipulation;

import java.util.Scanner;

public class Calisma12 {

    public static void main(String[] args) {

        /*
        bir sehir ismi aliniz ve ismin bas harfini buyuk diger butun harflerini kucuk harf olarak yazdirin.
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sehir = can.next().toLowerCase();

        String duzenlenmis = sehir.toUpperCase().charAt(0)+sehir.substring(1);
        System.out.println(duzenlenmis);

    }
}
