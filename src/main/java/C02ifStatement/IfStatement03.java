package C02ifStatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);

        System.out.println("lutfen bir ay adi giriniz");
        String ayAdi = can.nextLine();

        if(ayAdi.equalsIgnoreCase("Ocak")) {
            System.out.println("Birinci ayi isaretlediz");
        } else if (ayAdi.equalsIgnoreCase("Subat")){
            System.out.println("Ikinci ayi isaretlediz");
        } else if (ayAdi.equalsIgnoreCase("mart")){
            System.out.println("ucuncu ayi isaretlediz");
        } else if (ayAdi.equalsIgnoreCase("nisan")){
            System.out.println("dorduncu ayi isaretlediz");
//        } else if (ayAdi==5) {
//            System.out.println("Mayis");
//        } else if (ayAdi==6) {
//            System.out.println("Haziran");
//        } else if (ayAdi==7) {
//            System.out.println("Temmuz");
//        } else if (ayAdi==8) {
//            System.out.println("Agustos");
//        } else if (ayAdi==9) {
//            System.out.println("Eylul");
//        } else if (ayAdi==10) {
//            System.out.println("Ekim");
//        } else if (ayAdi==11) {
//            System.out.println("Kasim");
//        } else if (ayAdi==12) {
//            System.out.println("Aralik");
        }else{
            System.out.println("hatali ay numarasi girdiniz");
        }

    }
}
