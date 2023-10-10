package C03Ternary;

import java.util.Scanner;

public class Calisma05 {

    public static void main(String[] args) {
      
         /*
        kullanicidan bir tamsayi alin ve sayi 10'dan kucukse "Rakam" , 100'den kucukse "iki basamakli sayi"
         degilse "uc basamakli sayi" yazdirin
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi =can.nextInt();
        
        String result = sayi < 10 ? "Rakam" : (sayi < 100 ? "iki basamakli sayi" : "uc basamaklidir");

        System.out.println("result = " + result);
        
        
        
    }
}
