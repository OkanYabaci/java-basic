package C02ifStatement;

import java.util.Scanner;

public class Calisma05 {

    public static void main(String[] args) {

        /*
         Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir harf sifre girmesini isteyin.

        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf sifre giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if (ilkHarf == 'A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

        } else if (ilkHarf >= 'a' && ilkHarf<= 'z') {

            if (ilkHarf == 'z'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

        }else{
            System.out.println("gecersiz sifre girdiniz");
        }


    }
}
