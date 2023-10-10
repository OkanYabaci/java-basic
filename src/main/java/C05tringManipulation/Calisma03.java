package C05tringManipulation;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

        // lastIndexOf()

        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamis.
        - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle ve bir kelime giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String kelime = scan.next();

        if(!cumle.contains(kelime)){
            System.out.println("girilen kelime cumlede yoktur");
        } else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
            System.out.println("girilen kelime 1 kere kullanilmis");
        }else {
            System.out.println("girilen kelime 1'den fazla kullanilmis");
        }

    }
}
