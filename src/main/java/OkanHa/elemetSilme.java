package OkanHa;

import java.util.Arrays;
import java.util.Scanner;

public class elemetSilme {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayılardan oluşan bir array oluşturun ");

        int arr[]=new int[6];
        for (int i = 0; i < 6; i++) {
            int sayı= scan.nextInt();
            arr[i]=sayı;
          //  System.out.println( arr[i]=sayı);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("hangi elementi silmek istiyorsunuz? ");
        int sayı= scan.nextInt();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==sayı){
                arr[i]=0;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
