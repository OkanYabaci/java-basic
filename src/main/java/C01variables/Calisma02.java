package C01variables;

public class Calisma02 {

    public static void main(String[] args) {

         /*
        Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
            bulmak için bir kod yazınız.
         */

        Double toplam = Double.valueOf(Byte.MIN_VALUE + Short.MAX_VALUE);

//        System.out.println("toplam = " + toplam);
//
//        System.out.println(Byte.MIN_VALUE + Short.MAX_VALUE);

        byte sayi1 = (byte) 145;
        short sayi2 = (short) 33333;
        System.out.println(sayi2-sayi1);




    }
}
