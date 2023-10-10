package C03Ternary;

import java.util.Scanner;

public class Calisma03 {

    public static void main(String[] args) {

        //Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        
        String sonuc = sayi%2 ==0 ? "sayiniz cifttir" : "sayiniz tektir";
        System.out.println("sonuc = " + sonuc);

        System.out.println(sayi%2 ==0 ? "sayiniz cifttir" : "sayiniz tektir");
        
    }
}
