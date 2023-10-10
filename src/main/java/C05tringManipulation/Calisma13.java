package C05tringManipulation;

import java.util.Scanner;

public class Calisma13 {

    public static void main(String[] args) {
        
         /*
        uc adet String isim aliniz ve bosluklar haric karakter sayilari toplamini bulunuz
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen isimlerinizi giriniz ve Enter'a basiniz");
        String isim1 = can.nextLine();
        String isim2 = can.nextLine();
        String isim3 = can.nextLine();
        
        int karakterSayisi = (isim1.replaceAll("\\s", "").length()+isim2.replaceAll("\\s","").length()+
                isim3.replaceAll("\\s","").length());

        System.out.println("karakterSayisi = " + karakterSayisi);
        
        
        
    }
}
