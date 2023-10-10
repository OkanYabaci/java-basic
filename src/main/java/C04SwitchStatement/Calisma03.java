package C04SwitchStatement;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

          /*
        Kullanicidan bir sayi girmesini isteyin girilen sayi 10 ise "Iki basamakli en kucuk sayi"
        100 ise "uc basamakli en kucuk sayi" 1000 ise "dort basamakli en kucuk sayi"
        siger durumlarda "girdigin sayiyi degistir" yazdirin
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = can.nextInt();

           if ( sayi < 0){
               sayi = sayi*-1;
           }

        switch (sayi){

            case 10 :
                System.out.println("iki bas. en kucuk sayi");
                break;
            case 100 :
                System.out.println("uc bas. en kucuk sayi");
                break;
            case 1000 :
                System.out.println("dort bas. en sayi");
                break;
            default:
                System.out.println("Girdiginiz sayi tanimli degil");
        }

    }
}
