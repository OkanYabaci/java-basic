package OkanHa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class zb2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Adınızı ve soyadınızı giriniz");

        String adSoyad= scan.nextLine().toLowerCase();
        //     List<String> satz = new ArrayList<>();

        String[] arr = adSoyad.split(" ");
        System.out.println("Adınız:"+arr[0].toUpperCase());
        System.out.println("Soyadınız:"+arr[1].toUpperCase());


    }
    



}
