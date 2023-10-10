package C06MethodCreation;

import java.util.Scanner;

public class Calisma06 {

    public static void main(String[] args) {

         /*
        Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi mail
        - @ isareti icermiyorsa gecersiz email yazdirin
        - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen e-mail adresinizi yaziniz");
        String email = scan.next();

        emailKontrol(email);


    }

    private static void emailKontrol(String email) {
        int firstIndex = email.indexOf("@");
        int lastIndex = email.lastIndexOf("@");

        if(!(email.contains("@"))){
            System.out.println("gecersiz email");
        }else if (!(email.contains("@gmail.com"))){
            System.out.println("lutfen gmail adresinizi girin");
        } else if (!(email.endsWith("@gmail.com"))) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        } else if (firstIndex != lastIndex) {
            System.out.println("Yazim hatasi var");
        }else{
            System.out.println("mail adresiniz basari ile kaydedildi !");
        }
    }
}
