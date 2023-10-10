package C07ForLoop;

import java.util.Scanner;

public class Calisma01 {

    public static void main(String[] args) {

    /*
        kullanicidan bir tam sayi isteyin(100 e kadar) . 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.
         */

        Scanner can = new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir sayi giriniz");
        int sayi = can.nextInt();


        for(int i = 1; i<=sayi; i++ ){

            if (i%3==0){
                System.out.print("JAVA");
            } else if (i%5==0) {
                System.out.println("güzel");

            }
            else if (i%3==0 && i%5==0){
                System.out.println("java güzeldir");
            }
        }

    }

}
