package C03Ternary;

import java.util.Scanner;

public class Calisma06 {

    public static void main(String[] args) {
        
         /*
        Kullanicidan harf isteyin  , buyuk ise consola
         "Buyuk Harf ", kucuk harf ise consolda "Kucuk Harf"  yoksa "girdiginiz karakter harf degil
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf = can.next().charAt(0);
        
        String result = harf >= 'A' && harf <= 'Z' ? "Buyuk harftir" : (harf >= 'a' && harf <= 'z' ? "kucuk harftir " : "Girdiginiz karakter hatali");

        System.out.println("result = " + result);
        
    }
}
