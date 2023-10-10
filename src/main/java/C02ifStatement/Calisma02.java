package C02ifStatement;

import java.util.Scanner;

public class Calisma02 {

    public static void main(String[] args) {


        /*
        kullanicidan bir gun adi aliniz haftasonu mu hafta icimi oldugunu kontrol ediniz
         */

        Scanner can = new Scanner(System.in);

        System.out.println("Lutfen bir gun adi yaziniz");
        String gun = can.nextLine();

        if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma") ){
            System.out.println("Hafta ici");
        }else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("gun degildir");
        }
    }
}
