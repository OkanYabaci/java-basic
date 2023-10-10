package C06MethodCreation;

public class Calisma01 {

    public static void main(String[] args) {

        //Bir Methodu olusturmak o methodu  calistirmak icin yeterli degildir.
        //Eger bir methodu calistirmak isterseniz Method Call (methodu cagirmalisiniz)

        //method call yapmak icin varsa adi ve parametreleri yazilmalidir
        //  ==>60
        // sadece method call yaptigimizda method calisir, overloading olur.
        // eger methodun icinde bir sey yazdirdigimizda colsole da o yaziyi gorururz

        // anca method umuz  return type a sahipse bir sonuc return edecektir
        // bu sonucu ya direk yazdiririz

        int sonuc = topla(5,6);
        sonuc= 9+sonuc;

        System.out.println(topla(5,6)); //11
        System.out.println("sonuc = " + sonuc); //20
        
        myFirstMethod(5,6);


    }

    public static int topla(int sayi1, int sayi2) {
        
        return sayi1+sayi2; /// JAVA burda iki sayinin toplanmis halini dondurur
    }

    public static void myFirstMethod(int sayi1, int sayi2){

        int sonuc = sayi1*sayi2;

        System.out.println("sonuc = " + sonuc); //30
    }


}
