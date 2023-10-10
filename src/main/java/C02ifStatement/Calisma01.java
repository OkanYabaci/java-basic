package C02ifStatement;

import java.util.Scanner;

public class Calisma01 {

    public static void main(String[] args) {


//        int a = 4;
//        int b = 3;
//        int c = 5;
//
//        if(a < b){
//            System.out.println(a+b);
//        }else if(b == c) {
//            System.out.println("veriler esittir");
//        }else{
//            System.out.println(a*b);
//        }

        //  Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        //   olmadigini yazdirin.

        Scanner can = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini yaziniz");
        int a = can.nextInt();
        int b = can.nextInt();

        if (a==b){
            System.out.println("Karedir");
        }else if(a != b){
            System.out.println("Dikdortgendir");
        }else {
            System.out.println("yamuktur");
        }

//        if (a==b && a<b){
//            System.out.println("");
//        } else if (a==b || a<b) {
//            System.out.println();
//        }

    }
}
