package C07ForLoop;

public class Calisma02 {

    public static void main(String[] args) {

        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz.

        int toplam = 0;

        for(int i =3; i<7; i++){

            toplam = toplam+i;
            System.out.print(toplam+" "); //hangi degerleri aldigini yazdirir.
        }
        System.out.println();
        System.out.print(toplam); // sadece son degerini ekrana yazdirir.
        System.out.println();

        //Example 2: 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz
        
        int carpimSonucu = 1;
        
        for(int i = 6; i>2; i--){
            carpimSonucu = carpimSonucu * i;
        }
        System.out.println("carpimSonucu = " + carpimSonucu); //360
        System.out.println();


        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
        int numara = -385;
        numara = Math.abs(numara);
        System.out.println(numara);
        int sonuc = 0;
        
        for(int i = numara; i>0; i=i/10){
            
            sonuc = sonuc + i%10;
            
        }
        System.out.println("sonuc = " + sonuc);
        System.out.println();

        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK" --->   ey edip adanada pide ye    <-----
        String str = "Kaba";
        
        String ters = ""; //concat yapacaksak "" kullanailabilir
        
        for(int i = str.length()-1; i>=0 ; i--){

            char harf = str.charAt(i);

            ters = ters + harf;
        }
        System.out.println("ters = " + ters);
    }
}
