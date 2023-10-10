package C01variables;

public class Calisma01 {

    public static void main(String[] args) {


//        String isim = "Hüma";
//        System.out.println("isim = " + isim);
//        isim = "Yunus";
//        String soyad = "can";
//
//        System.out.println(isim);
//        System.out.println("isim : " + isim);

        byte aa ;
        short bb ;
        int cc ;
        double dd ;
        float ee ;

        short yas = 23;
        int yeniYas = yas;

        long yil = 1990 ;
        int yeniYil = (int) yil;

        double fiyat = 15.99;
        float yeniFiyat = (float) fiyat;

         /*
         Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
            Sonrasında bu short değişkenin değerini konsolda yazdırınız.
            Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
         */

        double cm = 10.5;
        cm = 22.5 ;
        short yeniCm = (short) cm;

        System.out.println(cm);

    }


}
