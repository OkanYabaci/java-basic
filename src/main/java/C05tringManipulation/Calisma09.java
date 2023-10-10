package C05tringManipulation;

public class Calisma09 {

    public static void main(String[] args) {

        //Example 1: Bir String deki space haric kac tane karakter kullanildigini gosteren kodu yaziniz

        String str = "Ali okula gitti.";

        int sayi = str.replaceAll(" ","").length();
        System.out.println(sayi);

        //Example 2: Bir Stringdeki tum a harflerini buyuk A ya ceviriniz
        String adana = "adana Kebab";
        String Abuyuksun =adana.replaceAll("a","A");
        System.out.println(Abuyuksun);

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz.

        String t = "Kara kara dusunme Ankara";
        t = t.toLowerCase();
        String yeni = t.replaceAll("kara","*");
        System.out.println(yeni);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String yeniId = stdId.replaceAll("[0-9]","*"); //A-Z, a-z
        System.out.println(yeniId);


        /*
            Bir grup data'yı ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions'in kısaltılmış halidir.

            1)Tüm rakamlar ==> [0-9]
            2)Tüm küçük harfler ==> [a-z]
            3)Tüm büyük harfler ==> [A-Z]
            4)Tüm harfler ==> [a-zA-Z]
            5)Sesli hardler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\ p{Punct}

            1) Rakamlar haric tum karakterler ==> [^0-9]
            2) kucuk harfler haric butun karakterler ==> [^a-z]
            3) Buyuk harfler haric tum karakterler.==> [^A-Z]
            4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5) Space haric ==> [^ ]
                */

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "HARIKA" yazdirin
        // aksi halde "Normal " yazdirin.

        String v = "Alex";
       boolean start = v.startsWith("Al"); //true
       boolean end = v.endsWith("x"); //true
       
       String result = start && end ? "HARIKA" : "Normal";
        System.out.println("result = " + result);


        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        //length()==0 demek isEmpty() true verir
        //bir String'in bos olup olmadigini anlamak icin "length()=0" kullanmayin, "isEmpty()" kullanin

        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        String ali =" ";
       boolean bosMu = ali.isEmpty();
       boolean eldeBiseyvar = ali.isBlank();

        System.out.println(bosMu);//false
        System.out.println(eldeBiseyvar); //true

    }
}
