package C02ifStatement;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

        //   Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        //   olmadigini yazdirin

        Scanner can = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char karakter = can.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z' || karakter >= 'a' && karakter <= 'z' ){
            System.out.println("girdiniz harftir");
        }else {
            System.out.println("harf degildir");
        }

    }
}
