package C05tringManipulation;

import java.util.Scanner;

public class Calisma14 {

    public static void main(String[] args) {

        Scanner can = new Scanner(System.in);
        /*
        Example 16 : Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız
         */
        String sentence = "Vay be! -Ali 13 +yaşında ama üniver*site ö%ğrencisi.";
        int toplamSayi = sentence.length();
        int harfVeSayilar = sentence.replaceAll("\\p{Punct}","").length(); //harf ve sayilarin sayisi

        System.out.println(toplamSayi-harfVeSayilar); //noktalama isaretleri :6



    }
}
