package C06MethodCreation;

import java.util.Scanner;

public class Calisma04 {


    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin ve tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime girin : ");
        String yazi = scan.nextLine();

        String cevrilen = cevir(yazi); //method call
        System.out.println(cevrilen);


    }
    //metnin ilk karakteri hariç geri kalan kısmı için aynı fonksiyon tekrar çağrılır.
    private static String cevir(String yazi) {

        if(yazi.isEmpty()){
            return yazi;
        }

        return cevir(yazi.substring(1)) + yazi.charAt(0); //recursive method cagirma denir.
    }
}
