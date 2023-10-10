package C05tringManipulation;

public class Calisma10 {

    public static void main(String[] args) {

        String str = "  Java ogrenmek cok kolay  ";

        System.out.println(str.replace("a","x"));

        System.out.println(str.replace("Java","x"));
        System.out.println(str);
        System.out.println();

        /*
        replace() methodu ile benzer olarak verilen String deki istenen yeni karakter degisikligini yaparlar,
        Farklar:
        1-replace() methodunda char kullanilabilir , replaceAll da char kullanilmaz
        2- replaceAll() methodunda Regular Expressions kullanilabilir.

        \\s ---> bosluk
        \\S ---> bosluk disindakiler
        \\w ---> harfler ve rakamlar (a-z,A-Z,0-9)
        \\d ---> rakamlari secer
        \\D ---> harfler ve rakamlar disindaki tum karakterler
         */

        String str2 = "Java'da rakamlar 123456789";
        System.out.println(str2.replaceAll("\\s","*")); //Java'da*rakamlar*123456789
        System.out.println(str2.replaceAll("\\S", "*")); //******* ******** *********
        System.out.println(str2.replaceAll("\\w", "*")); //****'** ******** *********
        System.out.println(str2.replaceAll("\\W", "*")); //Java*da*rakamlar*123456789
        System.out.println(str2.replaceAll("\\d", "*")); //Java'da rakamlar *********
        System.out.println(str2.replaceAll("\\D", "*")); //*****************123456789
        System.out.println();

        //replaceFirst () verilen stringdeki karakterin ilkini istenen karakter yapar.

        System.out.println(str2.replaceFirst("a", "+")); // J+va'da rakamlar 123456789
        System.out.println(str2.replaceFirst("lar", "+")); //Java'da rakam+ 123456789
        System.out.println();

        //trim() istedigimiz string in basinda ve sonunda spaceleri temizler
        System.out.println(str);
        System.out.println(str.length()); //27
        System.out.println(str.trim());
        System.out.println(str.trim().length()); //23
        System.out.println();

        // repeat()
        System.out.println("**".repeat(10) + "  Okul Yonetim Sistemi  " + "**".repeat(10));

        System.out.println(str.repeat(2));

    }
}
