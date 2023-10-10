package C05tringManipulation;

import java.util.Scanner;

public class Calisma02 {

    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir cumle ve bir kelime isteyin, harfin cumlede var olup
        //olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle ve bir harf giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String kelime = scan.next().toLowerCase();

        if(cumle.contains(kelime)){
            System.out.println("Iceriyor");
        }else{
            System.out.println("Yok");
        }

        if(cumle.indexOf(kelime) == -1){
            System.out.println("girdiginiz kelime yoktur");
        }else{
            System.out.println("vardir");
        }

    }
}
