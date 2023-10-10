package C02ifStatement;

import java.util.Scanner;

public class Calisma06 {

    public static void main(String[] args) {

        // // Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("girdiginiz sayi cifttir");
        } else if (sayi%2 == 1) {
            System.out.println("sayi tektir");
        } else if (sayi < 0) {
            System.out.println("lutfen tamsayi giriniz");
        }

    }
}
