package C05tringManipulation;

import java.util.Scanner;

public class Calisma15 {

    public static void main(String[] args) {

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        //length()==0 demek isEmpty() true verir

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true


        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("lutfen dogru giris yapiniz");
        }else{
            System.out.println(ilk);
        }



    }
}
