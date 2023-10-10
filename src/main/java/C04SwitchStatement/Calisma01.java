package C04SwitchStatement;

public class Calisma01 {

    public static void main(String[] args) {

        // switclerde long , float ve byte kullanilmaz

        int sayi = 3;

        switch (sayi){

            case 1 :
                System.out.println("sayi = 1");
                break;
            case 2 :
                System.out.println("sayi = 2");
                break;
            case 3 :
                System.out.println("sayi = 3");
                break;
            default :
                System.out.println("sayiniz bunlardan biri degil");
        }

    }
}
