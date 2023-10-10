package C06MethodCreation;

public class Calisma02 {

    public static void main(String[] args) {

        // Example 2: uc sayiyi birbiri ile carpan bir method olusturunuz
      int sonuc =  ucSayiCarp(5,6,7);
        System.out.println("sonuc = " + sonuc);

        // uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup , sonucu ekranda paylasiniz
        int sonuc2 = ilkIkiyiToplaUcuncuIleCarp(3,4,5);
        System.out.println("sonuc2 = " + sonuc2);
    }

    private static int ilkIkiyiToplaUcuncuIleCarp(int sayi1, int sayi2, int sayi3) {
        
        return (sayi1+sayi2)*sayi3;
    }

    public static int ucSayiCarp(int sayi1, int sayi2, int sayi3){
        int result = sayi1*sayi2*sayi3;
        
        return result;
   }


}
