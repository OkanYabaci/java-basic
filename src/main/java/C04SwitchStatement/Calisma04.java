package C04SwitchStatement;

import java.util.Scanner;

public class Calisma04 {

    public static void main(String[] args) {
        //toUpperCase --- toloworCase
        /*
        Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
         */
        Scanner can = new Scanner(System.in);
        System.out.println("lutfen S D E T harflerinden birini yaziniz");

        char karakter = can.next().toUpperCase().charAt(0);

        switch (karakter){

            case 'S' :
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Developer");
                break;
            case 'E' :
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Gecerli harf giriniz");
        }

    }
}
