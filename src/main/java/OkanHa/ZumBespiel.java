package OkanHa;

import java.util.Scanner;

public class ZumBespiel {
    public static void main(String[] args) {


        Scanner okan = new Scanner(System.in);
        System.out.println("bir kelime giriniz ");
        String kelime = okan.nextLine();

        int a = kelime.length();
        String tersineKelime="";
        for (int i = a; i >= 0; i--) {
            tersineKelime = kelime.substring(i,i+1);
           System.out.println(tersineKelime);
        }

    }
}