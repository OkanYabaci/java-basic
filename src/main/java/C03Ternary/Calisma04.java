package C03Ternary;

import java.util.Scanner;

public class Calisma04 {

    public static void main(String[] args) {
        
        /*
        kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin..
         */

        Scanner can = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi =can.nextInt();
        
        int result = sayi < 0 ? sayi*-1 : sayi;
        System.out.println("result = " + result);
        
    }
}
