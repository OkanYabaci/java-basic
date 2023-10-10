package C01variables;

import java.util.Scanner;

public class Modulus {

    public static void main(String[] args) {

        // kullanidan dogum tarihini isteyin ve dogum tarihinin // 1990
        // rakamlar toplamini hesaplayiniz

        Scanner can = new Scanner(System.in);
        System.out.println("dogum tarihinizi yaziniz");
        int tarih = can.nextInt();

        int rakamlarToplami = 0;

        int rakam = tarih%10;
        rakamlarToplami+=rakam;
        tarih = tarih/10;

        rakam = tarih%10;
        rakamlarToplami+=rakam;
        tarih = tarih/10;

        rakam = tarih%10;
        rakamlarToplami+=rakam;
        tarih = tarih/10;

        rakam = tarih%10;
        rakamlarToplami+=rakam;

        System.out.println("Rakamlar toplaminiz : "+rakamlarToplami);






    }
}
