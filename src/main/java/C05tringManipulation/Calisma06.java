package C05tringManipulation;

import java.util.Scanner;

public class Calisma06 {

    public static void main(String[] args) {

        //Example 1: kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz
        //           ==> Ramazan--Rn

        Scanner scan=new Scanner(System.in);
 //       System.out.println("lutfen isminizi giriniz");
        String isim =scan.next();

        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);

  //      System.out.println(ilkHarf+sonHarf);

        //2.yol

        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);
//        System.out.println(ilk+""+son);
 //       System.out.println(son);

        //Example 2: verilen string'deki tum hayvan isimlerini ekrana yazdiriniz
        // "Ben kedi esim tavuk oglum sever inek"

        String str = "Ben kedi, esim tavuk, oglum sever inek";

        String hayvanlar = str.substring(4,8)+" "+str.substring(15,20)+" "+str.substring(34);
        System.out.println("hayvanlar = " + hayvanlar);

        //*********************** ******************** ****************************************

        // kullanicidan bir isim aliniz ve adinin ve soyadinin bas harfleri yazdiriniz. //yunus can

        System.out.println("lutfen adinizi soyadinizi giriniz");
        String isimSoyad = scan.nextLine();

        String adinIlkHarfi = isim.substring(0,1);
        String soyadinIlkHarfi = isim.split(" ")[1].charAt(0)+" "+isim.split(" ")[2].charAt(0);

        System.out.println(adinIlkHarfi+soyadinIlkHarfi);


    }
}
