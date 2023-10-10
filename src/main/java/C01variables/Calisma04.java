package C01variables;

public class Calisma04 {

    public static void main(String[] args) {


        int a = 15;
        int b = a--;

        System.out.println(a);

        a-=3;
        a = a-3;
        System.out.println("a = " + a);

        String str1 = "Java";
        String str2 = "Guzel";

        int sayi1 = 5;
        int sayi2 = 6;

        System.out.println(str1+str2+" "+(sayi1+sayi2));
        //Java 5 Guzel

        System.out.println(str1+" "+sayi1+" "+str2);

        //Java 94
        System.out.println(str1+" "+"94");

        //65 Guzel
        System.out.println(sayi2+""+sayi1+" "+str2);

    }
}
