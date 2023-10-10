package C02ifStatement;

import java.util.Scanner;

public class Calisma04 {

    public static void main(String[] args) {

        //   Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin,
        //  calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen erkek isinez 'erkek', kadin iseniz 'kadin' yaziniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);  //tolowercase

        System.out.println("yasinizi yaziniz");

        int yas=scan.nextInt();

        if (cinsiyet == 'E' || cinsiyet == 'K'){
            if (yas < 65){
                System.out.println("emekli olamazsiniz emekliliginize kalan : "+(65-yas)+" yildir.");
            }else {
                System.out.println("emekliliginiz hayirli olsun.");
            }
        }else {
            System.out.println("girdiginiz bilgiler hatalidir");
        }

    }
}
