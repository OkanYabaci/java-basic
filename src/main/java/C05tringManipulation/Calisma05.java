package C05tringManipulation;

import java.util.Scanner;

public class Calisma05 {

    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin , mail @gmail.com icermiyorsa uyarin
        @gmail.com ile bitiyorsa email adresiniz kaydedildi, @gmail.com ile bitmiyorsa kontrol edin yazdirin
         */
        Scanner can = new Scanner(System.in);
        System.out.println("Bir email yaziniz");
        String email = can.next();

        boolean varMi = email.contains("@gmail.com");
        int start = email.indexOf("@gmail.com");
        int end = email.lastIndexOf("@gmail.com");

        int et = email.indexOf("@");
        int son = email.lastIndexOf("@");


        String result = varMi ? (email.endsWith("@gmail.com") ? (start != end ? "adresiniz hatali" : "gmailiniz kaydedildi" ) : "yaziminizi kontrol edin") : "lütfen gmail adresi giriniz" ;


//        if(!varMi){
//            System.out.println("gmail adresinizi giriniz");
//        } else if (start != end) {
//            System.out.println("yaziminizi kontrol edin");
//        } else if (et != son) {
//           System.out.println("adresi dogru girmelisin!");
//        } else if (!email.endsWith("@gmail.com")) {
//            System.out.println("adresiniz hatali");
//        }else{
//            System.out.println("gmailiniz kaydedildi");
//        }


    }
}
