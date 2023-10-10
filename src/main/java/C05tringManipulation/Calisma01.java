package C05tringManipulation;

public class Calisma01 {

    public static void main(String[] args) {

    // 1- concat methodu
        String isim = "okan";
        String soyad = "yabaci";

        System.out.println("concat ile : "+isim.concat(soyad));
        System.out.println();
        System.out.println("toplama ile : "+isim+soyad); //okanyabaci

        //2 - charAt
        String takim = "Galatasaray";

        System.out.println(takim.charAt(4));

        System.out.println(takim.toLowerCase());
        System.out.println(takim.toUpperCase());

        //3 - equals()

        String isim1 = "mehmet";
        String isim2 = "Mehmet";
        String isim3 = "mehmet";

        System.out.println(isim1.equals(isim2));
        System.out.println(isim1.equals(isim3));

        String isim4 = isim1 +"";
        System.out.println(isim4);

        System.out.println();

        System.out.println(isim1.equals(isim4));
        System.out.println(isim1==isim4);

        // 6- equalsIgnoreCase

        String a = "yunus";
        String b= "YuNus";

        System.out.println(a.equalsIgnoreCase(b));

        // 7- lenght()

        System.out.println(takim.length()); // 11

        System.out.println(takim.length()-1); //10

        // 8 - indexOf()

        System.out.println(takim.indexOf("t")); //4

        System.out.println(takim.lastIndexOf("t")); //4


    }
}
