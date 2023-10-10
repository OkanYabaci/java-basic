package C04SwitchStatement;

import java.util.Scanner;

public class Calisma02 {

    public static void main(String[] args) {

        /*
         Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
         */

        Scanner can = new Scanner(System.in);
        System.out.println("bugun yilin kacinci ayindayiz?");
        int sayi = can.nextInt();

        switch (sayi){

            case 1 :
                System.out.println("Januar");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("Marz");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            default:
                System.out.println("Gecerli bir ay giriniz");

        }

    }
}
