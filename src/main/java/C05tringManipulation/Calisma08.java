package C05tringManipulation;

import java.util.Scanner;

public class Calisma08 {

    public static void main(String[] args) {

         /*
        kullanicidan bir sifre girmesini isteyin sartlari sagliyorsa "sifre basari ile tanimlandi"
        saglamazsa "islem basarisiz..."

        i)ilk harf buyuk olmali
        ii) son harf kucuk olmali
        iii) sifre bosluk icermemeli
        iiii) sifre uzunlugu en az 8 karakter olmali

         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre =can.next();

       boolean ilkHarf = sifre.charAt(0) >= 'A' && sifre.charAt(0) <='Z';
       boolean sonHarf = sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1) <= 'z';
       boolean bosluk = sifre.contains(" ");
       boolean uzunluk = sifre.length() > 7;

       if(ilkHarf && sonHarf && !bosluk && uzunluk ){
           System.out.println("sifre basariyla kaydedildi");
       }else {
           System.out.println("islem basarisiz, lutfen yeni bir sifre giriniz");
       }




    }
}
