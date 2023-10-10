package C04SwitchStatement;

import java.util.Scanner;

public class Calisma05 {

    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alip hafta ici veya hafata sonu yazdirin
         */

        Scanner can = new Scanner(System.in);
        System.out.println("lutfen  gun ismi yaziniz");
        String gun = can.next().toLowerCase();

        switch (gun){

            case "monday" :
                System.out.println("Hafta ici");
                break;
            case "tuesday" :
                System.out.println("Hafta ici");
                break;
            case "wednesday" :
                System.out.println("Hafta ici");
                break;
            case "thursday" :
                System.out.println("Hafta ici");
                break;
            case "friday" :
                System.out.println("Hafta ici");
                break;
            case "saturday" :
                System.out.println("Hafta sonu");
                break;
            case "sunday" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gun adi giriniz");
        }





    }
}
