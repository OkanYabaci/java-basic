package C01variables;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

         /*
    İki tamsayıyı değiştirmek için bir kod yazınız.
           */

        Scanner can = new Scanner(System.in);
//
//        System.out.println("Lutfen iki sayi giriniz");
//
//        double x = can.nextDouble();
//        double y = can.nextDouble();
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.println();
//
//        double temp = x;
//        x = y ;
//        y = temp ;
//        System.out.println(x);
//        System.out.println(y);


        System.out.println("Lutfen birinci isim giriniz");
        String a = can.nextLine();
        System.out.println("Lutfen ikinci isim giriniz");
        String b = can.nextLine();

        System.out.println(a);
        System.out.println(b);


    }
}
